public class SquareAndMultiply {

    /**
     * Berechnet (x^y) mod z mittels Square-and-Multiply-Algorithmus (Links-nach-Rechts).
     * Verwendet long für Basistypen, um Überlauf bei Zwischenschritten zu vermeiden.
     *
     * @param x Die Basis (long).
     * @param y Der Exponent (long, nicht-negativ).
     * @param z Der Modul (long, muss > 1 sein).
     * @return Das Ergebnis von (x^y) mod z (long), oder -1 bei ungültigem Modul oder negativem Exponenten.
     */
    public static long power(long x, long y, long z) {
        // Sicherstellen, dass der Modul gültig ist
        if (z <= 1) {
            System.err.println("Fehler: Modul muss größer als 1 sein.");
            return -1; // Fehlerwert
        }
        // Basisfall: Exponent 0 ergibt 1 (für z > 1)
        if (y == 0) {
            return 1L;
        }
        // Exponent negativ wird hier nicht behandelt
        if (y < 0) {
             System.err.println("Fehler: Negativer Exponent wird nicht unterstützt.");
             return -1; // Fehlerwert
        }

        long result = 1L;
        // Reduziere die Basis initial modulo z.
        // Beachte, dass % in Java auch negativ sein kann, wenn x negativ ist.
        x = x % z;
        // Stelle sicher, dass x im Bereich [0, z-1] liegt
        if (x < 0) {
            x += z;
        }

        // Sonderfall: Basis ist 0 (nach Modulo-Reduktion)
        if (x == 0) {
            // 0^y = 0 für y > 0
            return 0L;
        }

        // Wandle den Exponenten in seine Binärdarstellung um
        String binaryExponent = Long.toBinaryString(y);

        // Iteriere durch die Bits des Exponenten von links nach rechts
        for (char bit : binaryExponent.toCharArray()) {
            // Square-Schritt (immer)
            // (result * result) kann potenziell Long.MAX_VALUE überschreiten,
            // aber das Ergebnis mod z sollte passen, wenn z klein genug ist.
            // Für sehr große Zahlen wäre BigInteger nötig.
            result = (result * result) % z;

            // Multiply-Schritt (nur wenn das aktuelle Bit '1' ist)
            if (bit == '1') {
                result = (result * x) % z;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Beispiel aus der Übung AFG-02: 2^12 mod 20
        long x1 = 2;
        long y1 = 12;
        long z1 = 20;
        long result1 = power(x1, y1, z1);
        if (result1 != -1) {
             System.out.println(x1 + "^" + y1 + " mod " + z1 + " = " + result1); // Erwartet: 16
        }

        // Beispiel aus dem vorherigen Kapitel: 3^50 mod 25
        long x2 = 3;
        long y2 = 50;
        long z2 = 25;
        long result2 = power(x2, y2, z2);
         if (result2 != -1) {
            System.out.println(x2 + "^" + y2 + " mod " + z2 + " = " + result2); // Erwartet: 24
        }

        // Größeres Beispiel
        long x3 = 123;
        long y3 = 1001;
        long z3 = 101;
        long result3 = power(x3, y3, z3);
         if (result3 != -1) {
            System.out.println(x3 + "^" + y3 + " mod " + z3 + " = " + result3);
        }

        // Beispiel mit ungültigem Modul
        long x4 = 7;
        long y4 = 5;
        long z4 = 1; // Ungültig
        long result4 = power(x4, y4, z4);
         if (result4 == -1) {
             System.out.println("Berechnung für " + x4 + "^" + y4 + " mod " + z4 + " fehlgeschlagen (ungültiger Modul).");
         }

         // Beispiel mit y=0
         long x5 = 7;
         long y5 = 0;
         long z5 = 100;
         long result5 = power(x5, y5, z5);
          if (result5 != -1) {
             System.out.println(x5 + "^" + y5 + " mod " + z5 + " = " + result5); // Erwartet: 1
         }
    }
}