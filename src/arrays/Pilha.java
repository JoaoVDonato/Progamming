package arrays;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();
        livros.add("O pequeno Príncipe");
        livros.push("Don quixote");
        livros.push("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.pop());
        System.out.println(livros.poll());
        System.out.println(livros.poll());

//        livros.size();
//        livros.contains();
//        livros.clear();
        //livros.isEmpty();
    }
}
