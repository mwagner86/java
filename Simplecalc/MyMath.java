/**
 * Eine Klasse fuer verschiedene Mathematische Funktionen.
 * Erweitert fuer die erste Einsendeaufgabe um die restlichen Grundrechenarten
 * mit jeweils 2 Zahlen von Typ int.
 * Dieser Minitaschenrechner beruecksichtigt, dass Teilen durch 0 verboten ist.
 * Er returned in diesem Fall einfach 0.
 * Das Programm ist nicht vor Integer Overflows geschuetzt.
 * Im Test sollte dies beruecksichtigt werden.
 * @author Maximilian Wagner (wagnerm@th-brandenburg.de)
 * @version 1.00, 10/2024
 */
public class MyMath
{
    /**
     * Diese Methode berechnet und liefert die Summe von 3 Zahlen vom Typ int.
     * 
     * @param n1
     *            erste Zahl
     * @param n2
     *            zweite Zahl
     * @param n3
     *            dritte Zahl
     * @return die Summe der Zahlen
     */

    public static int summiere3Zahlen(int n1, int n2, int n3) 
    {
        return n1 + n2 + n3;
    }

    /**
     * Diese Methode berechnet und liefert die Summe von 2 Zahlen vom Typ int.
     * 
     * @param n1
     *            erste Zahl
     * @param n2
     *            zweite Zahl
     * @return die Summe der Zahlen
     */
    
    public static int sum2Integers(int n1, int n2)
    {
        return (n1 + n2);
    }

    /**
     * Diese Methode berechnet und liefert die Subtraktion von 2 Zahlen vom Typ int.
     * 
     * @param n1
     *            erste Zahl
     * @param n2
     *            zweite Zahl
     * @return die Subtraktion der Zahlen
     */

    public static int sub2Integers(int n1, int n2)
    {
        return (n1 - n2);
    }

    /**
     * Diese Methode berechnet und liefert die Multiplikation von 2 Zahlen vom Typ int.
     * 
     * @param n1
     *            erste Zahl
     * @param n2
     *            zweite Zahl
     * @return die Multiplikation der Zahlen
     */

    public static int mult2Integers(int n1, int n2)
    {
        return (n1 * n2);
    }

    /**
     * Diese Methode berechnet und liefert die Division von 2 Zahlen vom Typ int.
     * Sollte die zweite Zahl 0 sein, wird immer 0 als Return Value gewaehlt.
     * 
     * @param n1
     *            erste Zahl
     * @param n2
     *            zweite Zahl
     * @return die Division der Zahlen
     */

    public static int div2Integers(int n1, int n2)
    {
        if (n2 == 0)
        {
            System.err.println("Du kannst nicht durch 0 Teilen");
            return 0;
        }
        else
            return (n1 / n2);
    }
}
