package Ltriangulo.test;

import Ltriangulo.dominio.Triangulo;

import java.util.Scanner;

public class TrianguloTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o lado B: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o lado C: ");
        double c = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(a, b, c);
        triangulo.TipoDoTriangulo();
    }
}
