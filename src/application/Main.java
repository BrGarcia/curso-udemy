package application;

import entities.Conta;
import entities.Cotacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

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
            titular = "Bruno Garcia";
            nConta = 13068;
            deposito = 55.0;
        }else{
            titular = "Bruno Garcia";
            nConta = 13068;
            deposito = 0.0;
        }
        Conta c1 = new Conta(titular, nConta, deposito);
        System.out.println("Cliente: "
                   + c1.titular
                   + " - Nº Conta: "
                   + c1.nConta
                   + " - Saldo: "
                   + c1.consultaSaldo());
        c1.deposito(120);
        c1.saque(221.50);

        /* RESOLUCAO EXERCICIO 46
        double moeda;
        System.out.print("Digite a Cotação do dolar: ");
        Cotacao.dolar = sc.nextDouble();
        System.out.print("Valor em BRL: ");
        moeda = sc.nextDouble();
        System.out.println("Valor em USD: "+Cotacao.conversaoReal(moeda));
        */


        }
    }