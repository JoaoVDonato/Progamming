package ProjetosProprios;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String retorno;


            do {
                System.out.println("Bem vindo a calculadora !");

                System.out.println("Digite um número");
                double num1 = entrada.nextDouble();

                System.out.println("Digite outro número");
                double num2 = entrada.nextDouble();

                System.out.println("Digite a operação");
                String op = entrada.next();

                if (op.equalsIgnoreCase("+")) {
                    double resultado1 = num1 + num2;
                    System.out.println(resultado1);
                } else if (op.equalsIgnoreCase("-")) {
                    double resultado2 = num1 - num2;
                    System.out.println(resultado2);

                } else if (op.equalsIgnoreCase("*")) {
                    double resultado3 = num1 * num2;
                    System.out.println(resultado3);

                } else if (op.equalsIgnoreCase("/")) {
                    double resultado4 = num1 / num2;
                    System.out.println(resultado4);
                }
                System.out.println("Digite Sair para fechar ou qualquer tecla para voltar");
                retorno = entrada.next();
            } while (!retorno.equalsIgnoreCase("SAIR"));



            entrada.close();

        }

    }


