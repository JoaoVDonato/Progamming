package arrays;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas a serem lançadas: ");
        int n = entrada.nextInt();
        double[] notas = new double[n];

        for(int i = 0; i < notas.length; i++) {
            System.out.println("Digita a nota " + (i + 1) + " :");
            notas[i] = entrada.nextDouble();
        }
        double total = 0;
        for(double nota: notas) {
            total += nota;
        }

        double media = total / notas.length;
        System.out.println("A média é " + media);
        entrada.close();
    }


    }

