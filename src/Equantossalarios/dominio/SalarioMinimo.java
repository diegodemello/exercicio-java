package Equantossalarios.dominio;

public class SalarioMinimo {
    private double salarioMinimo;
    private double salario;

    public double salarios(){
        return this.salario/this.salarioMinimo;
    }

    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
