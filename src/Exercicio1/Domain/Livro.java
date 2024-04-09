package Exercicio1.Domain;

import java.util.Arrays;

public class Livro {

    private String codigo;

    private String Titulo;

    private String[] Autores;

    private int Ano;

    private String ISBN;

    public String ShowLivro() {

       var Text =  String.format("Codigo: %s Ano: %d ISBN: %s Titulo: %s Autores: %s",
                this.codigo,
                this.Ano,
                this.ISBN,
                this.Titulo,
                Arrays.toString(Autores));

        return Text;
    }

    public Livro(String codigo, String titulo, String[] autores, int ano, String iSBN) {
        this.codigo = codigo;
        Titulo = titulo;
        Autores = autores;
        Ano = ano;
        ISBN = iSBN;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String[] getAutores() {
        return Autores;
    }

    public void setAutores(String[] autores) {
        Autores = autores;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int ano) {
        Ano = ano;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

}
