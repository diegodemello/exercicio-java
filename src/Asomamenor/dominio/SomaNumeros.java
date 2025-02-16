package Asomamenor.dominio;

public class SomaNumeros {
    private int a;
    private int b;
    private int c;
    private int soma;

    public SomaNumeros() {
    }

    public SomaNumeros(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int soma(){
        soma = this.a + this.b;
        return soma;
    }

    public void menor(){
        if(soma < this.c){
            System.out.println("A soma é menor que o valor de C");
        }else{
            System.out.println("A soma é maior que o valor de C");
        }
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
}
