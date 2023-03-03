package Classe.Desafio;

public class Jantar {
    public static void main(String[] args) {


        Comida c1 = new Comida("Macarrão", 0.350);
        Comida c2 = new Comida("Hamburguer", 0.300);
        Pessoa p = new Pessoa("João", 79.50);

        System.out.println(p.apresentar());
        p.Comer(c1);
        System.out.println(p.apresentar());
        p.Comer(c2);
        p.Comer(c2);
        System.out.println(p.apresentar());






    }

}
