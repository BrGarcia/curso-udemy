package secao5;

public class Aula67_Estudante {
private String nome;
private String email;
private int quarto;

public Aula67_Estudante(String n,String m,int q){
    this.nome = n;
    this.email = m;
    this.quarto = q;
}

public int getQuarto(){
    return  this.quarto;
}
public String getNome(){
    return this.nome;
}

public String toString(){
    return "Nome: "+nome+
           "- Email: "+email+
           "- Quarto: "+quarto;
}

}
