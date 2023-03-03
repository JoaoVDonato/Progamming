package Fundamentos.TipoPrimitivos;

public class TipoPrimitivos {
    public static void main(String[] args) {
        //Informações do Funcionário
        //Tipo numéricos inteiros

        byte anosDeEmpresa = 27;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L;

        //Tipo numéricos reais
        float salario = 11_545.44F;
        double vendasAcumuladas = 2_991_997_103.01;

        //Tipo Booleano
        boolean estaDeFerias = false; // true

        //Tipo Caractére
        char status = 't';

        //Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        //Número de viagens
        System.out.println(numeroDeVoos / 2);

        //Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Está de férias" + estaDeFerias);





    }
}

