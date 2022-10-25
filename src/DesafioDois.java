import java.util.Scanner;

public class DesafioDois {

    public static void main(String[] args) {
        if (args.length == 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o primeiro número");
            double numero1 = sc.nextDouble();
            System.out.println("Digite o segundo número");
            double numero2 = sc.nextDouble();
            System.out.println(numero1 + numero2);
        }
        if (args.length == 1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um número");
            double numero1 = sc.nextDouble();
            System.out.println(Integer.parseInt(args[0]) + numero1);
        }
        if (args.length == 2) {
            System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
        }
        if (args.length > 2) {
            System.out.println("A quantidade é inválida!");
        }
    }
}
