package Hnotas.dominio;

public class Notas {
    private double notaPrimeiroBimestre;
    private double notaSegundoBimestre;
    private double notaTerceiroBimestre;
    private double notaQuartoBimestre;

    public double calcularNotas(){
        return (notaPrimeiroBimestre + notaSegundoBimestre + notaTerceiroBimestre + notaQuartoBimestre) / 4;
    }

    public void setNotaPrimeiroBimestre(double notaPrimeiroBimestre) {
        this.notaPrimeiroBimestre = notaPrimeiroBimestre;
    }

    public void setNotaSegundoBimestre(double notaSegundoBimestre) {
        this.notaSegundoBimestre = notaSegundoBimestre;
    }

    public void setNotaTerceiroBimestre(double notaTerceiroBimestre) {
        this.notaTerceiroBimestre = notaTerceiroBimestre;
    }

    public void setNotaQuartoBimestre(double notaQuartoBimestre) {
        this.notaQuartoBimestre = notaQuartoBimestre;
    }
}
