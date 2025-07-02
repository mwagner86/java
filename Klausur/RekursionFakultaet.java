/*
Rekursion ist eine fundamentale Programmiertechnik,
bei der eine Methode sich selbst aufruft, um ein Problem in kleinere, handhabbare Teile zu zerlegen.
Jede gute rekursive Methode besteht immer aus zwei entscheidenden Teilen.

Die Abbruchbedingung (Base Case):
 Dies ist der einfachste Fall des Problems, der direkt gelöst werden kann,
ohne einen weiteren Selbstaufruf zu benötigen. Die Abbruchbedingung ist essenziell, um eine Endlosschleife zu verhindern.

Der rekursive Aufruf (Recursive Step):
Hier ruft sich die Methode selbst auf, aber mit einem modifizierten Argument, das dem Base Case einen Schritt näher kommt.

Ein klassisches Beispiel ist die Berechnung der Fakultät einer Zahl (z.B. 4! = 4 * 3 * 2 * 1).
Rekursiv ausgedrückt ist die Fakultät von n gleich n mal die Fakultät von n-1, bis wir bei 1 ankommen.
*/

public class RekursionFakultaet {

    /**
     * Berechnet die Fakultät einer Zahl n auf rekursive Weise.
     * @param n Die Zahl, von der die Fakultät berechnet werden soll.
     * @return Das Ergebnis der Fakultätsberechnung.
     */
    public static long fakultaet(int n) {
        // 1. Die Abbruchbedingung (Base Case)
        // Die Fakultät von 1 oder 0 ist per Definition 1.
        // Dies beendet die Rekursion.
        if (n <= 1) {
            return 1;
        }
        
        // 2. Der rekursive Aufruf (Recursive Step)
        // Die Methode ruft sich selbst auf, aber mit einem kleineren Wert (n - 1).
        // Das Ergebnis wird mit dem aktuellen n multipliziert.
        // Beispiel: fakultaet(4) -> 4 * fakultaet(3)
        //           fakultaet(3) -> 3 * fakultaet(2)
        //           fakultaet(2) -> 2 * fakultaet(1) -> gibt 1 zurück
        return n * fakultaet(n - 1);
    }

    public static void main(String[] args) {
        int zahl = 5;
        long ergebnis = fakultaet(zahl);
        
        System.out.println("Die Fakultät von " + zahl + " ist: " + ergebnis); // Ausgabe: Die Fakultät von 5 ist: 120
    }
}