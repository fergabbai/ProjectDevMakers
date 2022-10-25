import java.util.InputMismatchException;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int tamanho = getNumber(ent);
        int[][] tabuleiro = new int[tamanho][tamanho];
//                       MATRIZ: tamanho 1 independe do tamanho 2


        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                tabuleiro[i][j] = getNumber(ent);
            }
        }

        for (int [] linha : tabuleiro) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.print("\n");
        }

        double media = CalculaMedia(tabuleiro[1]);
        System.out.println("A média dos tamanhos" + tamanho + "valores" + media);

    }

    private static double CalculaMedia(int[] valores) {
        double soma = 0;
//      for (int valor : valores){
//          soma += valor;
//      }        SE QUISER FAZER LEITURA NOS DADOS | SOMENTE COM ARRAYS
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }
        return soma / valores.length;
    }

    static int getNumber(Scanner input) {
        try {
            System.out.println("Digite o valor desejado");
            return input.nextInt();
        } catch(InputMismatchException e) {
            input.nextLine();
            System.out.println("O tipo desejado está incorreto. Tente novamente");
            return getNumber(input);
        } catch(Exception e) {
            input.nextLine();
            System.out.println("Não foi possível obter o número");
            return getNumber(input);

        }
    }
}

