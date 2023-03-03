package Classe;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();
/*
        d1.dia = 1;
        d1.mes = 1;
        d1.ano = 1970;
*/

        Data d2 = new Data(04, 01, 2023);
//        d2.dia = 10;
//        d2.mes = 10;
//        d2.ano = 1910;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();





    }
}
