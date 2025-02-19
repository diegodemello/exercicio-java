package Kpessoaidade.test;

import Kpessoaidade.dominio.Pessoa;
import Kpessoaidade.dominio.PessoaAutenticacao;

import java.util.Scanner;

public class PessoaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        PessoaAutenticacao pessoaAutenticacao = new PessoaAutenticacao();

        System.out.print("Digite o seu nome: ");
        pessoa.setNome(scanner.nextLine());
        System.out.print("Digite a sua idade: ");
        pessoa.setIdade(scanner.nextInt());
        pessoaAutenticacao.maiorDeIdade(pessoa.getIdade());
    }
}
