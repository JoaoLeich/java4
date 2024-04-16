package Exercicio4.Model;

public class Estacionamento {

    private final int QUANTIDADE_MAXIMA_ESTACIONAMENTO = 10;

    private int QuantCarrosAtual = 0;

    private Periodo perido;

    public Estacionamento() {
    }

    public int getQUANTIDADE_MAXIMA_ESTACIONAMENTO() {
        return QUANTIDADE_MAXIMA_ESTACIONAMENTO;
    }

    public int getQuantCarrosAtual() {
        return QuantCarrosAtual;
    }

    public void setQuantCarrosAtual(int quantCarrosAtual) {
        QuantCarrosAtual = quantCarrosAtual;
    }

    public Periodo getPerido() {
        return perido;
    }

    public void setPerido(Periodo perido) {
        this.perido = perido;
    }

}
