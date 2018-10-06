package secao5;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Aula67 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);


        Aula67_Estudante[] pensao = new Aula67_Estudante[10];
        System.out.println("Quantos estudantes vao se hospedar: ");
        int menu = sc.nextInt();

        for(int i = 0; i< menu; i++){
            System.out.println("Nome: ");
            String nomeTemp = ss.nextLine();
            System.out.println("Email: ");
            String mailTemp = ss.nextLine();
            System.out.println("Quarto: ");
            int quartoTemp = sc.nextInt();
            Aula67_Estudante estudanteTemp = new Aula67_Estudante(nomeTemp,mailTemp,quartoTemp);

            pensao[quartoTemp] = estudanteTemp;

            System.out.println(estudanteTemp.toString());
        }

        for(int j = 0; j< pensao.length; j++){
        System.out.println(pensao[j].getNome());
        }


    }
}
