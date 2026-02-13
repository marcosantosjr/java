package com.java;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private Plano plano;
    private List<Conteudo> historico;

    public Usuario(String nome, Plano plano) {
        this.nome = nome;
        this.plano = plano;
        this.historico = new ArrayList<>();
    }

    public void assistir(Conteudo conteudo){
        historico.add(conteudo);
        System.out.println(nome + " assistiu: " + conteudo.getTitulo());
    }

    public void exibirHistorico() {
        System.out.println("Histórico de Conteúdos do Usuário" + nome);

        for (Conteudo c: historico) {
            c.exibirInformacoes();
            System.out.println("-------");
        }
    }
}
