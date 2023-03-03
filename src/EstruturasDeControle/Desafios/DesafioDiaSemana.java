package EstruturasDeControle.Desafios;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {

        System.out.println("Escreva um dia da semana(ex. Domingo, Segunda...): ");

        Scanner entrada = new Scanner(System.in);

        String dia = entrada.nextLine();

        if("domingo".equalsIgnoreCase(dia)) {
            System.out.println("1");
        } else if ("segunda".equalsIgnoreCase(dia)) {
            System.out.println("2");
        }else if ("terça".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia)) {
            System.out.println("3");
        }else if ("quarta".equalsIgnoreCase(dia)) {
            System.out.println("4");
        }else if ("quinta".equalsIgnoreCase(dia)) {
            System.out.println("5");
        }else if ("sexta".equalsIgnoreCase(dia)) {
            System.out.println("6");
        }else if ("sábado".equalsIgnoreCase(dia) || "sabado".equalsIgnoreCase(dia)) {
            System.out.println("7");
        } else {
            System.out.println("Dia inválido");
        }
        entrada.close();

    }
}
