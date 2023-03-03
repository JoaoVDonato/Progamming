package oo.composicao;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Item> adicionarItem = new ArrayList<Item>();

    void adicionarItem(Item item) {
        adicionarItem.add(item);
        item.compra = this;
    }

    double obterValorTotal() {
        double total = 0;
        for(Item item: adicionarItem) {
            total += item.quantidade * item.preco;

        }

        return total;

    }
}
