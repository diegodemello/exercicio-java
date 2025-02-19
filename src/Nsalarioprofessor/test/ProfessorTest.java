package Nsalarioprofessor.test;

import Nsalarioprofessor.dominio.Professor;

import java.util.Scanner;

public class ProfessorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Professor professor = new Professor();

        System.out.print("Digite o valor da hora/aula: ");
        professor.setValorAulas(scanner.nextDouble());
        System.out.print("Digite a quantidade de aulas dadas: ");
        professor.setAulas(scanner.nextInt());

        professor.SalarioLiquido();
    }
}
