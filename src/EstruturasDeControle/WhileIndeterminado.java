package EstruturasDeControle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {

//        Scanner entrada = new Scanner(System.in);
//
//        String valor = "";
//
//        while(!valor.equalsIgnoreCase("sair")) {
//            System.out.println("Você diz: ");
//            valor = entrada.nextLine();
//
//        }
//        entrada.close();

        Scanner teclado = new Scanner(System.in);

        int valor = 0;

        while (valor != -1) {
            System.out.println("Digite um número: ");
            valor = teclado.nextInt();
            System.out.printf("O valor é: " + valor + "\n");
        }
        teclado.close();

    }
}