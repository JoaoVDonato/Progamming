package oo.composicao;

public class CarroTeste {

    public static void main(String[] args) {

        Carro Astra = new Carro();
        System.out.println(Astra.estaLigado());

        Astra.ligar();
        System.out.println(Astra.estaLigado());

        System.out.println(Astra.motor.giros());

        Astra.acelerar();
        Astra.acelerar();
        Astra.acelerar();
        Astra.acelerar();

        System.out.println(Astra.motor.giros());


        Astra.frear();
        Astra.frear();
        Astra.frear();
        Astra.frear();
        Astra.frear();
        Astra.frear();
        Astra.frear();

//        faltou encapsulamento
//        Astra.motor.fatorInjecao = -30;

        System.out.println(Astra.motor.giros());


    }
}
