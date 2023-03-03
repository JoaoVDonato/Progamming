package EstruturasDeControle;

import java.util.Scanner;

public class IF {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a média: ");
        double media = entrada.nextDouble();

        if (media >= 7.0) {
            System.out.println("Aprovado !");
            System.out.println("Parabéns !");
        }
    }
}
