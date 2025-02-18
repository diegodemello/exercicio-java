package Ialunonotas.dominio;

public class Aluno extends Pessoa {
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    private double notaFinal;

    public double calcularNota(){
        notaFinal = (nota1 + nota2 + nota3 + nota4)/4;
        return notaFinal;
    }

    public boolean aprovacao(){
        if(notaFinal >= 6){
            return true;
        }else{
            return false;
        }
    }

    public void relatorio(){
        System.out.println("-------------------------");
        System.out.println("Relatório Escolar - Nº 1");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Nota Final: " + calcularNota());
        if(aprovacao() == true){
            System.out.println("Aluno aprovado");
        }else{
            System.out.println("Aluno reprovado");
        }
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double getNota4() {
        return nota4;
    }
}
