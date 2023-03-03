package EstruturasDeControle.Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int Continue; //continuar
        int drawnNumber; //numero sorteado
        int attempts; //tentativa
        int number; //numero

        do {
            System.out.println("Sorteando número entre 0 e 100...\n");
            Random randomNumber = new Random();
            drawnNumber = randomNumber.nextInt(101); //Porque colocar 101 entre parenteses ?

            System.out.println("Começou o Jogo ! Será que consegue me vencer ?!");
            attempts = 0;

            do {
                attempts++;
                System.out.printf("Tentativa %d: ", attempts);
                number = entrada.nextInt();

                if (number > drawnNumber) {
                    System.out.printf("\nO número sorteado é menor que %d\n\n", number);
                } else if (number < drawnNumber) {
                    System.out.printf("\nO número sorteado é maior que %d\n\n", number);
                } else {
                    System.out.printf("\nParabéns ! Você acertou o número em %d tentativas!\n\n", attempts);
                    break;
                }

            } while (attempts != 10);

            System.out.println("Digite 0 para sair, ou qualquer outro número para continuar: ");
            Continue = entrada.nextInt();

        } while (Continue != 0);

        System.out.println("Obrigado por jogar !");

        entrada.close();
    }
}