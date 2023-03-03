package arrays;

import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade de alunos:");
        int qtdDeAlunos = entrada.nextInt();
        System.out.print("Informe a quantidade de notas: ");
        int qtdDeNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[qtdDeAlunos] [qtdDeNotas];
        double total = 0;
        for (int a = 0; a < notasDaTurma.length; a++) {
            for(int n = 0; n < notasDaTurma[a].length; n++){

                System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
                notasDaTurma[a][n] = entrada.nextDouble();
                total += notasDaTurma[a][n];

            }
        }
        double media = total / (qtdDeAlunos * qtdDeNotas);
        System.out.println("A média da turma é" + media);


        entrada.close();
    }
}
