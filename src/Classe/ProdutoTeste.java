package Classe;

public class ProdutoTeste {

    public static void main(String[] args) {

//        1) Nessa situação criamos o objeto p1 do tipo produto e utilizamos o construtor(new produto()) para
//        acessar os atributos que existem na classe produto.
//        2) Após isso, utilizamos a notação ponto para chamar cada um dos atributos, conforme a necessidade;
//        3) Ao desenvolver um construtor Produto(), na classe Produto, e utilizar o atributos da classe como
//        parâmetro do construtor, é necessário, aplicar os parâmetro ao construtor do objeto criado.
       Produto p1 = new Produto("Notebook", 4356.89, 0.25);
//       p1.nome = "Notebook";
//       p1.preco = 4356.89;
//       p1.desconto = 0.25;

       Produto p2 = new Produto();
       p2.nome = "Caneta Preta";
       p2.preco = 12.56;
       p2.desconto = 0.29;

       System.out.println(p1.nome);
       System.out.println(p2.nome);

//        1) No caso abaixo, refatoramos o precoFinal1 e 2, utilizando o método precoComDesconto, criado na classe
//        Produto, otimizando o código e deixando a classe operar.
//        2) Colocamos os valores dentro de precoComDesconto, atribuindo eles á fórmula descontoDoGerente

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Media do carrinho = R$%.2f.", mediaCarrinho);







    }
}
