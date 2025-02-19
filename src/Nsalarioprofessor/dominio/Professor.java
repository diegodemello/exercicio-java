package Nsalarioprofessor.dominio;

public class Professor {
    private double salario;
    private double valorAulas;
    private int aulas;

    public void SalarioLiquido(){
        salario = valorAulas * aulas;
        System.out.print("Salário líquido mensal: R$ " + salario);
    }

    public double getValorAulas() {
        return valorAulas;
    }

    public void setValorAulas(double valorAulas) {
        this.valorAulas = valorAulas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAulas() {
        return aulas;
    }

    public void setAulas(int aulas) {
        this.aulas = aulas;
    }
}
