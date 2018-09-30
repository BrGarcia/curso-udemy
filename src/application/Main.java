package application;

import entities.Cotacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double moeda;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite a Cotação do dolar: ");
        Cotacao.dolar = sc.nextDouble();
        System.out.print("Valor em BRL: ");
        moeda = sc.nextDouble();
        System.out.println("Valor em USD: "+Cotacao.conversaoReal(moeda));


    }
}
