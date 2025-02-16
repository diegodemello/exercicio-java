package Asomamenor.test;

import Asomamenor.dominio.SomaNumeros;

import java.util.Scanner;

public class TresValoresSoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SomaNumeros somaNumeros = new SomaNumeros();

        System.out.print("Digite o valor A: ");
        somaNumeros.setA(scanner.nextInt());
        System.out.print("Digite o valor B: ");
        somaNumeros.setB(scanner.nextInt());
        System.out.print("Digite o valor C: ");
        somaNumeros.setC(scanner.nextInt());

        System.out.println(somaNumeros.soma());
        somaNumeros.menor();
    }
}
