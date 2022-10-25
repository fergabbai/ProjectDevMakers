import java.sql.SQLOutput;
import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número");
        double numero1 = sc.nextDouble();
        System.out.println("Informe o segundo número");
        double numero2 = sc.nextDouble();

        System.out.println(numero1 + numero2);
    }
}
