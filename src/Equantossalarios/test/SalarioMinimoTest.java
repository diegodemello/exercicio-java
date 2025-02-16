package Equantossalarios.test;

import Equantossalarios.dominio.SalarioMinimo;

import java.util.Scanner;

public class SalarioMinimoTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SalarioMinimo salarioMinimo = new SalarioMinimo();

        System.out.print("Digite o salário mínimo atual: ");
        salarioMinimo.setSalarioMinimo(scanner.nextDouble());
        System.out.print("Digite o seu salário atual: ");
        salarioMinimo.setSalario(scanner.nextDouble());

        System.out.printf("Você recebe %.2f %n", salarioMinimo.salarios(), " salários mínimos.");
    }
}
