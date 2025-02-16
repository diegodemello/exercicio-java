package Freajuste.test;

import Freajuste.dominio.Reajuste;

import java.util.Scanner;

public class ReajusteTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reajuste reajuste = new Reajuste();

        System.out.print("Digite o seu salário: ");
        reajuste.setSalario(scanner.nextDouble());
        System.out.println("Seu salário com reajuste: " + reajuste.ReajusteSalarial());
    }
}
