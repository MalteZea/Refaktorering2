public class VisAktuelTid {
    public static void main(String[] args) {
        tiden();
    }
    public static void tiden(){
        // Få vist det totale antal millisekunder siden midnat, Jan 1, 1970
        long totaleMillisekunder = System.currentTimeMillis();

        // Få vist det totale antal sekunder siden midnat, Jan 1, 1970
        long totaleSekunder = totaleMillisekunder / 1000;

        // Omregn til the aktuelle sekund, i det her minut, i den her time
        long aktuelleSekunder = totaleSekunder % 60;

        // Omregn det totale antal minutter
        long totaleMinutter = totaleSekunder / 60;

        // Omregn til det aktuelle minut i den her time
        long aktuelleMinutter = totaleMinutter % 60;

        // Få det totale antal timer
        long totaleTimer = totaleMinutter / 60;

        // Udregn den aktuelle time
        long aktuelleTimer = totaleTimer % 24;

        // Vis resultater
        System.out.println("Klokken er nu " + aktuelleTimer + ":"
                + aktuelleMinutter + ":" + aktuelleSekunder + " GMT");
    }
}