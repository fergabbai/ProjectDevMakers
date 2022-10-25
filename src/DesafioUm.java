public class DesafioUm {

    public static void main(String[] args) {
        final double fator1;
        final double fator2;
        double celsius;
        double fahrenheit;

        fator1 = 9/5d;
        fator2 = 32;
        celsius = 25;
        fahrenheit = (celsius * fator1) + fator2;

        System.out.println(fahrenheit);
    }
}
