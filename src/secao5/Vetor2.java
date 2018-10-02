package secao5;
import entities.Produto;
import java.util.Locale;
import java.util.Scanner;

public class Vetor2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // INICIO DO PROGRAMA
        System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        Produto[] pLista = new Produto[n];

        for(int i = 0; i<n; i++){
            System.out.print("Digite preco do produto: ");
            double precoTemp = sc.nextDouble();

            System.out.print("Digite nome do produto: ");
            String xNome = sc.nextLine();

            Produto p = new Produto(xNome, precoTemp);
            pLista[i] = p;
        }
        //for(int i = 0; i<n; i++){
        //    pLista[i].toString();
        //}
    }

}
