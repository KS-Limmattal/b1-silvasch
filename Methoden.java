public class Methoden {

    // TODO: Schreibe hier die Methoden für die Teilaufgaben.

    public static String hours(int seconds) {
        int restAfterHours = seconds % 3600;
        int hours = (seconds - restAfterHours) / 3600;
        int restAfterMinutes = restAfterHours % 60;
        int minutes = (restAfterHours - restAfterMinutes) / 60;
        return java.lang.String.format("%02d:%02d:%02d", hours, minutes, restAfterMinutes);
    }
    
    public static void main(String[] args){
        // Test-Code für Teilaufgabe a)
        System.out.println("Aufgabe a)");
        System.out.println(hours(3));
        System.out.println(hours(75));
        System.out.println(hours(0));
        System.out.println(hours(59));
        System.out.println(hours(60));
        System.out.println(hours(100));
        System.out.println(hours(3600));
        System.out.println(hours(4000));
        System.out.println();

        // Test-Code für Teilaufgabe b)
        System.out.println("Aufgabe b)");
        // TODO: Schreibe Testcode für die Aufgabe
        System.out.println();
    }
    
}
