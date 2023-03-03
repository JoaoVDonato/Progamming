package arrays;

import java.util.Arrays;

public class testes {
    public static void main(String[] args) {

        String[] nomeDosAlunos = new String[10];

        nomeDosAlunos[0] = "João Donato";
        nomeDosAlunos[1] = "Joaquim";
        nomeDosAlunos[2] = "Joana";
        nomeDosAlunos[3] = "Jorge";
        nomeDosAlunos[4] = "Maria";
        nomeDosAlunos[5] = "Danielle";
        nomeDosAlunos[6] = "Francielle";
        nomeDosAlunos[7] = "Marcela";
        nomeDosAlunos[8] = "Mateus";
        nomeDosAlunos[9] = "Jarbas";

       System.out.println(Arrays.toString(nomeDosAlunos));

        for(int i = 0; i < 10; i++) {
            System.out.println(nomeDosAlunos[i]);
        }

        String[] nomeDosAlunosB = {"João Donato", "Joaquim", "Joana", "Jorge", "Maria",
                "Danielle", "Francielle", "Marcela", "Mateus", "Jarbas"};
        System.out.println(Arrays.toString(nomeDosAlunosB));


    }
}
