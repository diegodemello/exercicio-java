package Gimc.test;

import Gimc.dominio.Imc;
import Gimc.dominio.Pessoa;

import java.util.Scanner;

public class PessoaImcTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Imc imc = new Imc();

        System.out.print("Digite o seu peso: ");
        imc.setPeso(scanner.nextDouble());
        System.out.print("Digite a sua altura: ");
        imc.setAltura(scanner.nextDouble());

        imc.Imc();
    }
}
