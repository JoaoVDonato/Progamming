package EstruturasDeControle.Exercicios;

import java.util.Scanner;

public class VerificadorDeNumeroPar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double num = entrada.nextDouble();


        if (num >= 0 && num <= 10) {
            if (num % 2 == 0) {
                System.out.println("Este número é par");
            } else {
                System.out.println("Este número não é par");

            } System.out.println("Este número está entre 0 e 10");
        } else{
            System.out.println("Este número não está entre 0 e 10");
        }
    }
}