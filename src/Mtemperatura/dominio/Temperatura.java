package Mtemperatura.dominio;

public class Temperatura {
    private double temperatura;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double conversor(){
        return 5 * (temperatura - 32)/9;
    }
}
