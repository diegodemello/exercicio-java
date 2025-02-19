package Kpessoaidade.dominio;

public class PessoaAutenticacao {
    private Pessoa pessoa;

    public void maiorDeIdade(int idade){
        if(idade >= 18){
            System.out.println("Acesso autorizado, você é maior de idade.");
        }else{
            System.out.println("Acesso negado, você é menor de idade.");
        }
    }
}
