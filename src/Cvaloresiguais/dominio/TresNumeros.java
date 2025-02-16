package Cvaloresiguais.dominio;

public class TresNumeros {
    private int a;
    private int b;
    private int c;

    public TresNumeros() {
    }

    public TresNumeros(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int iguais(){
        if(this.a == this.b){
            int c = this.a + this.b;
            return c;
        }else{
            int c = this.a * this.b;
            return c;
        }
    }
}
