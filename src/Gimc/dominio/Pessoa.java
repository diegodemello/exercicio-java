package Gimc.dominio;

public class Pessoa {
    private double peso;
    private double altura;

    public Pessoa() {
    }

    public Pessoa(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}
