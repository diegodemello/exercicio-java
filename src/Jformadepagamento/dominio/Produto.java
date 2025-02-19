package Jformadepagamento.dominio;

public class Produto {
    private double valor;
    private final double dezPorcento = 0.10;
    private final double quinzePorcento = 0.15;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void MetodoDePagamento(int x){
        switch (x) {
            case 1:
                this.valor = valor;
                valor = valor - (valor * quinzePorcento);
                System.out.println("O preço final será: " + valor);
            case 2:
                this.valor = valor;
                valor = valor - (valor * dezPorcento);
                System.out.println("O preço final será: " + valor);
            case 3:
                this.valor = valor;
                System.out.println("O preço final será: " + valor);
            case 4:
                this.valor = valor;
                valor = valor + (valor * dezPorcento);
                System.out.println("O preço final será: " + valor);
            default:
                System.out.println("Valor digitado errado.");
                return;
        }

    }
}
