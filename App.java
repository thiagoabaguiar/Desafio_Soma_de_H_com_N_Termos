import java.util.Scanner;

public class App {

    public static void main (String[] args){

        double numerator = 1;
        double denominator;
        double sumTotal = 0;

        System.out.println("Digite a quantidade de termos: ");
        try (Scanner scan = new Scanner(System.in)) {

            denominator = scan.nextDouble();

            for (int i = 1; i <= denominator; i++){

                sumTotal = sumTotal + (numerator / i);
    
            }

            System.out.println("A soma dos termos é: " + (String.format("%.0f", sumTotal)));

        }

    }

}