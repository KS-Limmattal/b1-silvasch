public class Loops {
    
    // TODO: Schreibe hier die Methoden für die Teilaufgaben.

    static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void primeFactorisation(int n) {
        int originalN = n;
        
        System.out.print(java.lang.String.format("Prime facorisation of %d = ", n));

        boolean isFirstFactor = true;
        
        outer:
        for (int prime = 2; prime <= originalN; prime += 1) {
            if (!isPrime(prime)) {
                continue;
            }

            while (true) {
                if (n == 1) {
                    break outer;
                }
                if (n % prime == 0) {
                    n = n / prime;
                    if (isFirstFactor) {
                        System.out.print(prime);
                        isFirstFactor = false;
                    } else {
                        System.out.print(" * " + Integer.toString(prime));
                    }
                } else {
                    break;
                }
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        
        // Test-Code für Teilaufgabe c)
        System.out.println("Aufgabe c)");
        primeFactorisation(48);
        primeFactorisation(541);
        primeFactorisation(72);
        primeFactorisation(36);
        primeFactorisation(48);
        primeFactorisation(12);
        primeFactorisation(100);
        primeFactorisation(84);
        primeFactorisation(8);
        primeFactorisation(32);
        primeFactorisation(24);
        primeFactorisation(91);
        primeFactorisation(15);

        
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
