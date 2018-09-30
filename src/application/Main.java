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
        Conta c1 = new Conta("Bruno Garcia",10306, 55.00);
        System.out.println("Saldo: "+ c1.consultaSaldo());
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
