import java.util.ArrayList;

public class Loops {
    
    // TODO: Schreibe hier die Methoden für die Teilaufgaben.

    static ArrayList<Integer> generatePrimes() {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        primes.add(11);
        primes.add(13);
        primes.add(17);
        primes.add(19);
        primes.add(23);
        primes.add(29);
        primes.add(31);
        primes.add(37);
        primes.add(41);
        primes.add(43);
        primes.add(47);
        primes.add(53);
        primes.add(59);
        primes.add(61);
        primes.add(67);
        primes.add(71);
        primes.add(73);
        primes.add(79);
        primes.add(83);
        primes.add(89);
        primes.add(97);
        return primes;
    }

    public static void primeFactorisation(int n) {
        System.out.print(java.lang.String.format("Prime facorisation of %d = ", n));
        
        ArrayList<Integer> primes = generatePrimes();
        ArrayList<Integer> factors = new ArrayList<Integer>();

        int currentFactor = primes.remove(0);

        while (true) {
            if (n == 1) {
                break;
            }
            
            if (n % currentFactor == 0) {
                n = n / currentFactor;
                factors.add(currentFactor);
            } else {
                currentFactor = primes.remove(0);
            }
        }

        int firstFactor = factors.remove(0);
        System.out.print(firstFactor);

        for (int i = 0; i < factors.size(); i++) {
            System.out.print(java.lang.String.format(" * %d", factors.get(i)));
        }

        System.out.println();
    }
    
    public static void main(String[] args){
        
        // Test-Code für Teilaufgabe c)
        System.out.println("Aufgabe c)");
        primeFactorisation(48);
        // TODO: Schreibe mehr Testcode
        System.out.println();

        // Test-Code für Teilaufgabe d)
        System.out.println("Aufgabe d)");
        for (int n = 0; n < 12; n++){
            // System.out.println("Pi approximated to " + n + " digits with pi()  is " + pi(n));
        }
        System.out.println();
    }
}
