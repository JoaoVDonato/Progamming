package oo.composicao.Desafio;

import java.util.ArrayList;

public class Cliente {

    String nome;
    ArrayList<Compra> listaDeCompras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    double obterValorTotal() {
        double total = 0;
        for(Compra compra: listaDeCompras) {
            total += compra.obterValorTotal();
        }

        return total;
    }










}
