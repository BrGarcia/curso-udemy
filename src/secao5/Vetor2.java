package secao5;
import entities.Produto;
import java.util.Locale;
import java.util.Scanner;

public class    Vetor2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); //SCANNER PARA DOUBLE
        Scanner ss = new Scanner(System.in); //SCANNER PARA STRING
        // INICIO DO PROGRAMA
        System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        double mediaPreco = 0;
        Produto[] pLista = new Produto[n];

        for(int i = 0; i<pLista.length; i++){

            System.out.print("Digite preco do produto: ");
            double precoTemp = sc.nextDouble();
            System.out.print("Digite nome do produto: ");
            String nomeTemp = ss.nextLine();
            System.out.println("teste "+i);
            Produto p = new Produto(nomeTemp, precoTemp);
            pLista[i] = p;
        }
        for(int i = 0; i<pLista.length; i++){
            mediaPreco += pLista[i].getPreco();
            pLista[i].toString();
        }
        System.out.println(mediaPreco/pLista.length);
    }
}

