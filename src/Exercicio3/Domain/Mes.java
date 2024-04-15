package Exercicio3.Domain;

import java.util.ArrayList;

public class Mes {

    private String Nome;

    private int QteDias;

    private Dia[] Dias = new Dia[30];

    public Mes(String nome, int qteDias) {
        Nome = nome;
        QteDias = qteDias;
    }

    public void AdicionarCompromisso(Compromisso compromisso, int DiaMes) {

        this.Dias[DiaMes - 1].AdicionarCompromisso(compromisso);

    }

    public void AdicionarCompromisso(String pessoa, String local, String assunto, int hora, int DiaMes) {

        Compromisso compromisso = new Compromisso(pessoa, local, assunto, hora);

        this.Dias[DiaMes - 1].AdicionarCompromisso(compromisso);

    }

    public void ExcluirCompromisso(int DiaMes, int Hora) {

        this.Dias[DiaMes - 1].ExcluirCompromisso(Hora);

    }

    public String ListarCompromissos(int DiaMes) {

        return this.Dias[DiaMes - 1].ListarCompromissos();

    }

    public String ListarCompromissos() {

        return "TODO";

    }

}
