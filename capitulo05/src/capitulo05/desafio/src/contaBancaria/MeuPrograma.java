/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contaBancaria;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class MeuPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero da sua conta");
        int numeroContaUm = teclado.nextInt();

        ContaBancaria contaUm = new ContaBancaria(numeroContaUm, 0.0);
        while (true) {

            System.out.println("Qual operacao deseja fazer?");
            System.out.println("1 - deposito");
            System.out.println("2 - saque");
            System.out.println("3 - verificar saldo");
            int operacao = teclado.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Informe o valor que seja depositar");
                    double valor = teclado.nextInt();
                    contaUm.depositar(valor);
                    break;
                case 2:
                    System.out.println("Informe o valor que deseja sacar");
                    double saque = teclado.nextInt();
                    contaUm.sacar(saque);
                    break;
                case 3:
                    System.out.println("O saldo da conta e de " + contaUm.saldoConta() + " R$");
            }
            //Precisa desse nextLine pra limpar o Buffer
            teclado.nextLine();

            System.out.println("Deseja fazer outra operacao?");
            String opcao = teclado.nextLine();
            if (opcao.equals("sim") || opcao.equals("Sim") || opcao.equals("s") || opcao.equals("SIM")) {
                /*Pra comparar String precisa desse equals*/
                System.out.println("                     ");
                System.out.println("---------------------");
                System.out.println("                     ");
            } else if (opcao.equals("nao") || opcao.equals("não") || opcao.equals("Nao") || opcao.equals("Não")
                    || opcao.equals("NAO") || opcao.equals("NÃO")) {
                System.out.println("A operacao sera finalizada. Volte sempre");
                break;
            } else {

                while (!opcao.equals("sim") && !opcao.equals("nao")) {
                    System.out.println("Resposta invalida. Responda sim ou nao");
                    System.out.println("Deseja fazer outra operacao?");
                    opcao = teclado.nextLine();
                    if (opcao.equals("sim")) {
                        System.out.println("                     ");
                        System.out.println("---------------------");
                        System.out.println("                     ");
                    } else if (opcao.equals("nao")) {
                        break;
                    }
                }

            }
        }
        System.out.println("                                    ");
        System.out.println("                                    ");
        System.out.println("------------------------------------");
        System.out.println("O programa sera finalizado. Obrigado");
    }

}
