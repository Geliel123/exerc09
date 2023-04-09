import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        double Fahrenheit;
        double Celsius;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        Fahrenheit = teclado.nextDouble();

        teclado.close();

        Celsius = 5 * ((Fahrenheit - 32) / 9);

        System.out.printf("Temperatura em celsius:" + Celsius + "°c");

    }

}
