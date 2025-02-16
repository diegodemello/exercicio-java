package Dantecessorsucessor.test;

import Dantecessorsucessor.dominio.Numero;

import java.util.Scanner;

public class NumeroTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Numero numero = new Numero();

        System.out.print("Digite um número: ");
        numero.setNumero(scanner.nextInt());
        numero.antecessor();
        numero.sucessor();
    }
}
