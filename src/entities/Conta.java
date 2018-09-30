package entities;

public class Conta {
    public String titular;
    public final double nConta;
    public double saldo;

    //CRIAÇÃO DA CONTA
    public Conta(String nome,double conta){
        this.titular = nome;
        this.nConta = conta;
        this.saldo = 0.0;
    }
    public Conta(String nome,double conta,double depositoInicial ){
        this.titular = nome;
        this.nConta = conta;
        this.saldo = depositoInicial;
    }

    //SAQUE/DEPOSITO OPERACOES BASICAS
    public void deposito(double valor){
        this.saldo += valor;
        System.out.println("Valor depositado: "+ valor);
        System.out.println("Saldo disponivel: "+ this.saldo);
    }
    public void saque(double valor){
        this.saldo -= (valor + 5.0);
        System.out.println("Valor Sacado: "+ valor);
        if(this.saldo <0){
            System.out.println("Cliente utilizando cheque especial.");
        }
        System.out.println("Saldo disponivel: "+ this.saldo);
    }

    public double consultaSaldo(){
        return this.saldo;
    }

}