/*
 * Bemerkung: "Methode" und "Befehl" sind Synonyme.
 */

public class Main {
    
    // Dies ist eine Methode/ ein Befehl
    public static void hello(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        // Dies ist ein Kommentar
        // Dies ruft die Methode/ den Befehl hello() auf.
        hello("Anna");
        hello("Berta");
        
        // Variablen
        String text = "Hallo";
        int zahl = 1;
        System.out.println(text + " " + zahl);
        text = "Tschüs";
        zahl = zahl + 1;
        System.out.println(text + " " + zahl);
    }
}
