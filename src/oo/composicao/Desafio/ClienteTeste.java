package oo.composicao.Desafio;

public class ClienteTeste {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("André");
        Compra compra1 = new Compra();

        compra1.adicionarItem("Iphone", 3500.00, 5);

        compra1.obterValorTotal();





    }
}
