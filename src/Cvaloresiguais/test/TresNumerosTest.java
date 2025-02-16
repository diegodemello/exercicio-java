package Cvaloresiguais.test;

import Cvaloresiguais.dominio.TresNumeros;

import java.util.Scanner;

public class TresNumerosTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TresNumeros tresNumeros = new TresNumeros();

        System.out.print("Digite o valor A: ");
        tresNumeros.setA(scanner.nextInt());
        System.out.print("Digite o valor B: ");
        tresNumeros.setB(scanner.nextInt());

        System.out.println(tresNumeros.iguais());
    }
}
