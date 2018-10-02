package entities;

public class Produto {
    private String nome;
    private double preco;

    public Produto(){}
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public
    public String toString(){
        return  "Produto: "
                + nome
                + " - Preço: R$"
                + String.format("%.2f", preco);
    }
}
