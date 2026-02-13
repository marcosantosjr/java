package com.java;

public class Main {
    static void main() {
        Plano plano1 = new Plano("Premium", 49.90, "4K");

        Usuario usuario1 = new Usuario("Ana", plano1);

        Filme filme1 = new Filme("Vingadores", "Ficção", 2010, 148);
        Serie serie1 = new Serie("The Chosen", "Suspense/Drama", 2016, 4);

        usuario1.assistir(filme1);
        usuario1.assistir(serie1);

        System.out.println("");
        usuario1.exibirHistorico();
    }
}
