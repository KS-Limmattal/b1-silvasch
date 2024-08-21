public class Arrayz {
    
    // TODO: Schreibe hier die Methoden für die Teilaufgaben.
    static double[] sort(double[] array) {
      outer:
      while (true) {
        for (int i = 1; i < array.length; i++) {
          if (array[i] < array[i - 1]) {
            double temp = array[i];
            array[i] = array[i - 1];
            array[i - 1] = temp;
            continue outer;
          }
        }
        break;
      }
      return array;
    }
    
    public static void main(String[] args){
        
        // Test-Code für Teilaufgabe e)
        System.out.println("Aufgabe e)");
        for (double i: sort(new double[]{2, 3, 10, 4, 12, 45, 3, 1})) {
          System.out.println(i);
        }
        // TODO: Schreibe mehr Testcode
        System.out.println();

        // Test-Code für Teilaufgabe f)
        System.out.println("Aufgabe f)");
        int[][] magicSquare = new int[][] { { 12, 6, 15, 1 },
                { 13, 3, 10, 8 },
                { 2, 16, 5, 11 },
                { 7, 9, 4, 14 }
        };
        // System.out.println(isMagicSquare(magicSquare));
        int[][] nonMagicSquare = new int[][] { { 1, 6, 15, 1 },
                { 13, 3, 10, 8 },
                { 2, 16, 5, 11 },
                { 7, 9, 4, 14 }
        };
        // System.out.println(isMagicSquare(nonMagicSquare));
        System.out.println();
    }
}
