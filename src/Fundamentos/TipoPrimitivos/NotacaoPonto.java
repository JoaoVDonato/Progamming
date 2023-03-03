package Fundamentos.TipoPrimitivos;

public class NotacaoPonto {
    public static void main(String[] args) {

        //Replace significa substituir

        String s = "Bom dia X";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        System.out.println(s);
        s = s.concat("!!!");

        System.out.println(s);

    }
}
