package EstruturasDeControle.Desafios;

public class DesafioIf {
    public static void main(String[] args) {
        //Desafio do If
        double nota = 1.3;

        if (nota >= 9.0); {
            System.out.println("Quadro de Honra!");
            System.out.println("Você é fera");
        }
        //O erro está na sentença "if (nota >= 9.0);", pois ao utilizar essa estrutura de controle,
        //não deve ser colocado ";" após os parenteses, pois assim a regra está sendo isolada
        //do local onde ela será aplicada.


    }
}
