package EstruturasDeControle.Exercicios;

import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int somadorDeNumero = 0;

        while (numero >= 0) {
            System.out.println("Digite apenas número positivos para somar");
            numero = entrada.nextInt();

            if (numero >=0) {
                somadorDeNumero += numero;
                System.out.printf("\nO resultado é %d\n", somadorDeNumero);
            }
        }entrada.close();
    }
}




