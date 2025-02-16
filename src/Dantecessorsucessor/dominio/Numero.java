package Dantecessorsucessor.dominio;

public class Numero {
    private int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void antecessor(){
        System.out.println("Antecessor: " + (numero - 1));
    }

    public void sucessor(){
        System.out.println("Sucessor: " + (numero + 1));
    }
}
