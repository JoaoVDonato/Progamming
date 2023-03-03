package oo.composicao.Desafio;

import java.util.ArrayList;

public class Compra {


    ArrayList<Item> listaDeItens = new ArrayList<>();

   void adicionarItem(String nome, double preco, int qtde) {
       
   }

    void adicionarItem(Produto p, int qtde) {
        this.listaDeItens.add(new Item(qtde, p));

    }
    double obterValorTotal() {
        double total = 0;
        for(Item item: listaDeItens) {
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }



}
