import java.util.Scanner;
import java.text.DecimalFormat;

public class FahrenheitTilCelsius {
    public static void main(String[] args) {
        konverter();
    }
    public static void konverter() {
        Scanner input = new Scanner(System.in);

        System.out.print("Indfør en grad i Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        // Konverter Fahrenheit til Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);

        DecimalFormat df = new DecimalFormat("0.#");
        String formatCelsius = df.format(celsius);

        System.out.println("Fahrenheit " + fahrenheit + " er " +
                formatCelsius + " i Celsius");
    }
}