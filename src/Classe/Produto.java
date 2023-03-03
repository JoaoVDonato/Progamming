package Classe;

public class Produto {

//    Abaixo estão os atributos da Classe. Eles são variáveis que em algum momento, podem ser chamados pelo
//    objeto no código principal
    String nome;
    double preco;
//    A título de exemplo, o acréscimo de static no desconto, gera um padrão para o desconto
    static double desconto = 0.25;

//    1) Abaixo temos o construtor, no qual são designados parâmetros, que podem ser utilizados, no código fonte

        Produto(String nomeInicial, double precoInicial, double descontoInicial) {
            nome = nomeInicial;
            preco = precoInicial;
            desconto = descontoInicial;
        }
        Produto() {

        }

//    1) abaixo ocorre a criação do método. O seu retorno é do tipo double, pelo fato do objetivo ser
//    o preço com desconto. Além disso, não precisamos colocar nenhum parâmetro, pois tudo o que é ne-
//    cessário, já contem na classe produto, especificamente nos atributos.

//    2) Passamos o parâmetro desconto do gerente, acrescentando no cálculo.

    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    }
    double precoComDesconto() {
        return preco * (1 - desconto);
    }


}
