import java.util.Scanner;

public class VisTiden {
    public static void main(String[] args) {
       tid();

    }
    public static void tid() {
        Scanner input = new Scanner(System.in);
        // Bed brugeren om indput
        System.out.print("Indfør en integer for sekunder: ");

        int sekunder = input.nextInt();

        int minutter = sekunder / 60; // Find minutter i sekunder

        int sekunderTilbage = sekunder % 60; // Sekunder tilbage

        System.out.println(sekunder + " sekunder er " + minutter +
                " minutter og " + sekunderTilbage + " sekunder");
    }
}