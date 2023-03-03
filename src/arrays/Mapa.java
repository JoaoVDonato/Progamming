package arrays;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {
        Map<Long, String> usuarios = new HashMap<>();
//        usuarios.put(1, "Alberto");
//        usuarios.put(1, "Roberto");

        System.out.println(usuarios.size());
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());
        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("A"));
        System.out.println(usuarios.get(4));






    }
}
