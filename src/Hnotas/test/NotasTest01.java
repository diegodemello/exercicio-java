package Hnotas.test;

import Hnotas.dominio.Notas;

import java.util.Scanner;

public class NotasTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Notas notas = new Notas();

        System.out.print("Digite a nota do primeiro bimestre: ");
        notas.setNotaPrimeiroBimestre(scanner.nextDouble());
        System.out.print("Digite a nota do segundo bimestre: ");
        notas.setNotaSegundoBimestre(scanner.nextDouble());
        System.out.print("Digite a nota do terceiro bimestre: ");
        notas.setNotaTerceiroBimestre(scanner.nextDouble());
        System.out.print("Digite a nota do quarto bimestre: ");
        notas.setNotaQuartoBimestre(scanner.nextDouble());

        System.out.println("A média das suas notas é: " + notas.calcularNotas());
    }
}
