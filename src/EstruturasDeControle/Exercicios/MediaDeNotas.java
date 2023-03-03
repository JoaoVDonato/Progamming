package EstruturasDeControle.Exercicios;

import java.util.Scanner;

public class MediaDeNotas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        double n1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota");
        double n2 = entrada.nextDouble();

        double media = (n1 + n2 ) / 2;

        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else if (media <= 4){
            System.out.println("Aluno reprovado");
        } else {
            System.out.println("Aluno em recuperação");
        }
        entrada.close();
    }
}
