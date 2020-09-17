import java.util.Scanner;

public class UdregnLån {
    public static void main(String[] args) {
       lån();
    }
    public static void lån(){
        // Lav en skanner
        Scanner input = new Scanner(System.in);

        // Indfør den årlige rente stigning
        System.out.print("Indfør den årlige rente stigning, for eksempel 8.25: ");
        double årligRenteStigning = input.nextDouble();

        // Udregn den månedlige rente stigning
        double månedligRenteStigning = årligRenteStigning / 1200;

        // Indfør antal år
        System.out.print(
                "Indfør antal år som en integer, for eksempel 5: ");
        int antalÅr = input.nextInt();

        // Indfør lånets størrelse
        System.out.print("Indfør lånets størrelse, for eksempel 120000.95: ");
        double lånStørrelse = input.nextDouble();

        // Udregn tilbagebetaling
        double månedligAfbetaling = lånStørrelse * månedligRenteStigning / (1
                - 1 / Math.pow(1 + månedligRenteStigning, antalÅr * 12));
        double totalTilbagebetaling = månedligAfbetaling * antalÅr * 12;

        // Vis resultater
        System.out.println("Den månedlige afbetaling er " +
                (int)(månedligAfbetaling * 100) / 100.0 + "kr");
        System.out.println("Den totale tilbagebetaling er " +
                (int)(totalTilbagebetaling * 100) / 100.0 + "kr");
    }
}