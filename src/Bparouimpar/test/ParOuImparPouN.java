package Bparouimpar.test;

import Bparouimpar.dominio.Numero;

import java.util.Scanner;

public class ParOuImparPouN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Numero numero = new Numero();

        System.out.print("Digite um número: ");
        numero.setNumero(scanner.nextInt());

        numero.parOuImpar();
        numero.positivoOuNegativo();
    }
}
