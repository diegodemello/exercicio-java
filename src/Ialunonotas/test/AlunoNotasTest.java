package Ialunonotas.test;

import Ialunonotas.dominio.Aluno;

import java.util.Scanner;

public class AlunoNotasTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Digite o seu nome: ");
        aluno.setNome(scanner.next());
        System.out.print("Digite a sua idade: ");
        aluno.setIdade(scanner2.nextInt());

        System.out.print("Digite a sua primeira nota: ");
        aluno.setNota1(scanner2.nextDouble());
        System.out.print("Digite a sua segunda nota: ");
        aluno.setNota2(scanner2.nextDouble());
        System.out.print("Digite a sua terceira nota: ");
        aluno.setNota3(scanner2.nextDouble());
        System.out.print("Digite a sua quarta nota: ");
        aluno.setNota4(scanner2.nextDouble());

        aluno.relatorio();
    }
}
