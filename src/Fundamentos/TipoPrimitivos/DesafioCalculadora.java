package Fundamentos.TipoPrimitivos;

import javax.swing.*;
import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {

//        System.out.println("Bem-vindo a calculadora !");
//        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número").replace("," , ".");
//        String valor2 = JOptionPane.showInputDialog("Digite o segundo número").replace("," , ".");
//        String valor3 = JOptionPane.showInputDialog("Digite uma operação para calcular");
//
//        double numero1 = Double.parseDouble(valor1);
//        double numero2 = Double.parseDouble(valor2);
//
//        double resultado = valor1

        //Calculadora
        System.out.println("Digite um valor");
        Scanner entrada = new Scanner(System.in);
        double valor1 = entrada.nextDouble();
        System.out.println("Digite outro valor");
        double valor2 = entrada.nextDouble();
        System.out.println("Digite a operação");
        String operador = entrada.next();

        double resultado = "+".equals(operador) ? valor1 + valor2 : 0;
        resultado = "-".equals(operador) ? valor1 - valor2 : resultado;
        resultado = "*".equals(operador) ? valor1 * valor2 : resultado;
        resultado = "/".equals(operador) ? valor1 / valor2 : resultado;
        resultado = "%".equals(operador) ? valor1 % valor2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", valor1, operador, valor2, resultado);

        entrada.close();





    }
}
