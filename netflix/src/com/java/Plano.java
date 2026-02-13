package com.java;

public class Plano {
    private String nome;
    private double preco;
    private String resolucao;

    public Plano(String nome, double preco, String resolucao) {
        this.nome = nome;
        this.preco = preco;
        this.resolucao = resolucao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public void exibirPlano(){
        System.out.println(nome + " - R$ " + preco + " - " + resolucao);
    }
}
