package Freajuste.dominio;

public class Reajuste {
    private double salario;
    private final double porcentagem = 0.5;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double ReajusteSalarial(){
        return salario + (salario * porcentagem);
    }
}
