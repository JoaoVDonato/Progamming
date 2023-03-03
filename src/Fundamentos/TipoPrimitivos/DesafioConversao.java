package Fundamentos.TipoPrimitivos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o seu antepenúltimo salário: ");
        String salario1 = teclado.nextLine().replace("," , ".");

        System.out.print("Digite o seu penúltimo salário: ");
        String salario2 = teclado.nextLine().replace("," , ".");

        System.out.print("Digite o seu último salário: ");
        String salario3 = teclado.nextLine().replace("," , ".");

        double valor1 = Double.parseDouble(salario1);
        double valor2 = Double.parseDouble(salario2);
        double valor3 = Double.parseDouble(salario3);

        double media = (valor1 + valor2 + valor3) / 3;

        System.out.println("A Média dos três últimos salários são de: " + media);

        teclado.close();

    }
}
