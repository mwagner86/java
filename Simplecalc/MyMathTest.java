/**
 * Testprogramm fuer die Klasse MyMath.
 * Erweitert Tests, um die neuen Klassenfunktionen zu demonstrieren.
 * @author Maximilian Wagner (wagnerm@th-brandenburg.de)
 * @version 1.00, 10/2024
 */
public class MyMathTest
{
    /**
     * Main-Method zum Starten und Testen der Klasse MyMath. Diese main-Methode
     * ist der definierte Einstiegspunkt fuer die Ausfuehrung des Programs und
     * erlaubt das Programm zu testen.
     * 
     * @param args
     *            die Argumente, die man im Allgemeinen fuer die Ausfuehrung
     *            geben kann
     */
    public static void main(String[] args)
    {
        // Statische Methoden der Klasse MyMath testen
        System.out.println("Summe von 1,2,3: "
                + MyMath.summiere3Zahlen(1, 2, 3));
        System.out.println("Summe von -1,-2,3: "
                + MyMath.summiere3Zahlen(-1, -2, 3));

        // Hier folgen Tests meines simplen Taschenrechners

		System.out.println("Hier folgen die neuen Tests:\n");

        System.out.println("Summe von 10, 32: "
		+ MyMath.sum2Integers(10,32));

		System.out.println("Subtraktion von 10, 52: "
		+ MyMath.sub2Integers(10, 52));

		System.out.println("Multiplikation von 21, 15: "
		+ MyMath.mult2Integers(21, 15));

		// Hier teste ich, ob der Fall des Teilens durch 0 berucksichtigt wird
		// Ich returne einfachheitshalber 0, falls dies der Fall ist.
		System.out.println("Division von 21, 0: "
		+ MyMath.div2Integers(21, 0));

		// Merke: Da mit ints gerechnet wird, wird immer abgerundet.
		System.out.println("Division von 21 / 6: "
		+ MyMath.div2Integers(21, 6));
    }
}
