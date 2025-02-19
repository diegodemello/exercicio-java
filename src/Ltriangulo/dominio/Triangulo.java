package Ltriangulo.dominio;

public class Triangulo {
    private double a;
    private double b;
    private double c;

    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void TipoDoTriangulo(){
        if(a == b && b == c){
            System.out.println("Esse triangulo é equilátero");
        } else if (a == b || b == c || a == c) {
            System.out.println("Esse triangulo é isósceles");
        }else if(a != b && b != c){
            System.out.println("Esse triangulo é escaleno");
        }
    }
}
