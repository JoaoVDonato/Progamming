package ProjetosProprios.JonBank;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menu1;
        do {
            System.out.println("Olá, selecione a opção para prosseguir");
            System.out.println("[1] Cadastrar");
            System.out.println("[2] Logar");
            menu1 = entrada.nextInt();

            switch (menu1) {
                case 1: {
                    Clientes c1 = new Clientes();
                    Cadastro cadastro = new Cadastro();
                    System.out.println("Digite seu nome");
                    cadastro.setNome(entrada.next());
                    System.out.println("Digite uma senha de 4 dígitos");
                    cadastro.setSenha(entrada.nextInt());
                    if (c1.salvar(cadastro)) {
                        System.out.println("Cliente cadastrado com sucesso");
                    } else {
                        System.out.println("Erro ao cadastrar");
                        break;
                    }
                } case 2: {
                    Clientes c1 = new Clientes();
                    Cadastro cadastro = new Cadastro();
                    boolean check = true;
                    if(cadastro.getNome().equalsIgnoreCase(cadastro.getNome())) {
                        check = true;
                    }else check = false;



                    }

                }

        } while (menu1 == 1);



            System.out.println("Seja bem vindo ao JonBank !");


            System.out.println("[1] Consultar  ");
            System.out.println("[2] Sacar");
            System.out.println("[3] Depositar");
            int menu2 = entrada.nextInt();

            switch (menu2) {
                case 1: {

                    break;
                }
                case 2: {

                    break;
                }
                case 3: {

                    break;
                }


            }
        entrada.close();
    }

    }






