package Jformadepagamento.test;

import Jformadepagamento.dominio.Produto;

import java.util.Scanner;

public class ProdutoTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.print("Digite o valor do produto: ");
        produto.setValor(scanner.nextDouble());
        System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("2 - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        System.out.print("Digite a forma de pagamento: ");
        int x = scanner.nextInt();
        produto.MetodoDePagamento(x);
    }
}
