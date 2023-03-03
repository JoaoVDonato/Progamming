package arrays;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        //offer e add -> adicionam elementos na fila
        //Diferença é o comportamento ocorre quando a fila está cheia
        fila.add("ana"); //retorna false
        fila.offer("Bia"); // lança uma exceção
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

        //Peek e Element -> obter o próximo elementos da fila (sem remover)

        System.out.println(fila.peek()); // retornar false
        System.out.println(fila.peek());
        System.out.println(fila.element()); //Lança uma exceçãoo
        System.out.println(fila.element());
//

        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());

//        fila.size();
//        fila.clear();
//        fila.isEmpty();
        //fila.contains(...)
    }
}
