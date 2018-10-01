package application;

import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class aula55 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        //Exercicio Aula 55 Banco
        System.out.println("Criar conta com deposito inicial? 1-Sim | 2-Nao");
        int menu = sc.nextInt();
        String titular;
        double nConta;
        double deposito;
        if (menu == 1) {
            System.out.println("Digite nome do cliente: ");
            titular = "Bruno Garcia";
            System.out.println("Digite numero da Conta: ");
            nConta = 13068;
            System.out.println("Digite deposito inicial");
            deposito = 55.0;
        } else {
            titular = "Bruno Garcia";
            nConta = 13068;
            deposito = 0.0;
        }
        Conta c1 = new Conta(titular, nConta, deposito);
        System.out.println(c1.toString());

        c1.deposito(120);
        c1.saque(221.50);
    }
}
