package Classe;

public class Data {

//    criar 3 atributos dia, mês e ano.
//    Assim como em produto, estamos criando atributos na classe data.
    int dia;
    int mes;
    int ano;

    Data() {
//        dia = 1;
//        mes = 1;
//        ano = 1970;
        this(1, 1, 1970);
    }
    Data(int dia, int mes, int anoInicial ) {
        this.dia = dia;
        this.mes = mes;
        ano = anoInicial;
    }
    String obterDataFormatada() {
        String formato = "%d/%d/%d\n";
        return String.format(formato, dia, mes, ano);
    }
    void imprimirDataFormatada() {
        System.out.println(this.obterDataFormatada());
    }
}

