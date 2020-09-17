import java.util.Scanner;

public class VekselPenge {
    public static void main(String[] args) {
        omregner();
    }
    public static void omregner(){
        // Lav en Scanner
        Scanner input = new Scanner(System.in);

        // Modtag et beløb
        System.out.print("Indfør et beløb som double, for eksempel 11.56: ");
        double beløb = input.nextDouble();

        int tilbageværendeBeløb = (int)(beløb * 100);

        // Find antallet af én dollars
        int antalletAfEnDollars = tilbageværendeBeløb / 100;
        tilbageværendeBeløb = tilbageværendeBeløb % 100;

        // Find antallet af quarters i det tilbageværende beløb
        int antalletAfQuarters = tilbageværendeBeløb / 25;
        tilbageværendeBeløb = tilbageværendeBeløb % 25;

        // Find antallet af dimes i det tilbageværende beløb
        int antalletAfDimes = tilbageværendeBeløb / 10;
        tilbageværendeBeløb = tilbageværendeBeløb % 10;

        // Find antallet af nickels i det tilbageværende beløb
        int antalletAfNickels = tilbageværendeBeløb / 5;
        tilbageværendeBeløb = tilbageværendeBeløb % 5;

        // Find antallet af pennies i det tilbageværende beløb
        int numberOfPennies = tilbageværendeBeløb;

        // Vis resultat
        System.out.println("Dit beløb " + beløb + " består af");
        System.out.println("    " + antalletAfEnDollars + " dollars");
        System.out.println("    " + antalletAfQuarters + " quarters ");
        System.out.println("    " + antalletAfDimes + " dimes");
        System.out.println("    " + antalletAfNickels + " nickels");
        System.out.println("    " + numberOfPennies + " pennies");
    }
}