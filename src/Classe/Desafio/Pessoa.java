package Classe.Desafio;

public class Pessoa {
    String nome;
    double peso;

    Pessoa() {
    }

    Pessoa(String nomePessoa, double pesoPessoa) {
        this.nome = nomePessoa;
        this.peso = pesoPessoa;
    }



    void Comer(Comida comida) {
        if(comida != null) {
          this.peso += comida.peso;

        }
    }
    String apresentar() {
        return "Oi, me chamo " + nome + " e estou pesando " + peso + " kg";
    }
}
