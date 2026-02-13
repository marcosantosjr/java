package com.java;

public class Serie extends Conteudo{
    private int temporadas;

    public Serie(String titulo, String genero, int ano, int temporadas) {
        super(titulo, genero, ano);
        this.temporadas = temporadas;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Série: "+ getTitulo() + ", Ano: " + getAno());
        System.out.println("Gênero: " + getGenero() + ", Temporadas: " + temporadas);
    }
}
