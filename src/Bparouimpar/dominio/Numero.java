package Bparouimpar.dominio;

public class Numero {
    private int numero;
    private int resto;

    public Numero() {
    }

    public Numero(int numero) {
        this.numero = numero;
    }

    public void parOuImpar(){
        resto = this.numero % 2;
        if(resto != 0){
            System.out.println(this.numero + " é impar");
        }else{
            System.out.println(this.numero + " é par");
        }
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void positivoOuNegativo(){
        if(this.numero > 0){
            System.out.println(this.numero + " é positivo");
        }else{
            System.out.println(this.numero + " é negativo");
        }
    }
}
