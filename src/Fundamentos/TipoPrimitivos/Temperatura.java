package Fundamentos.TipoPrimitivos;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        // (ºF - 32 ) x 5/9 = ºC
        final double Fator = 5.0 / 9.0;
        final double Ajuste = 32;


        System.out.println("Digite a temperatura em ºF para converter em ºC: ");

        Scanner teclado = new Scanner (System.in);
        String fahrenheit = teclado.nextLine();

        double valorFahrenheit = Double.parseDouble(fahrenheit);
        double celsius = (valorFahrenheit - Ajuste) * Fator;
        System.out.println("A temperatura é " + celsius + " ºC");

        teclado.close();

    }
}
