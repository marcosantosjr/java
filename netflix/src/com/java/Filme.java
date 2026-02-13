package com.java;

public class Filme extends Conteudo{
    private int duracao;

    public Filme(String titulo, String genero, int ano, int duracao) {
        super(titulo, genero, ano);
        this.duracao = duracao;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Título: "+ getTitulo() + ", Ano: " + getAno());
        System.out.println("Gênero: " + getGenero() + ", Duração: " + duracao + "min");
    }
}
