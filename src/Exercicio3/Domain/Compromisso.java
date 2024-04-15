package Exercicio3.Domain;

public class Compromisso {

    private String Nome;

    private String Local;

    private String Assunto;

    public Compromisso() {
    }

    public Compromisso(String nome, String local, String assunto, int hora) {
        Nome = nome;
        Local = local;
        Assunto = assunto;
        Hora = hora;
    }

    private int Hora;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String local) {
        Local = local;
    }

    public String getAssunto() {
        return Assunto;
    }

    public void setAssunto(String assunto) {
        Assunto = assunto;
    }

    public int getHora() {
        return Hora;
    }

    public void setHora(int hora) {
        Hora = hora;
    }

}
