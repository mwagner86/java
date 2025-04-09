package Krypto;

import java.lang.Math; // Math.abs is used

public class OptimizedEuclideanAlgorithm {

    /**
     * Berechnet den größten gemeinsamen Teiler (ggT) von zwei ganzen Zahlen
     * mithilfe des optimierten euklidischen Algorithmus (rekursive Variante mit Modulo).
     * Negative Eingaben werden durch Betragsbildung behandelt.
     *
     * @param a Die erste ganze Zahl.
     * @param b Die zweite ganze Zahl.
     * @return Der ggT von a und b.
     */
    public static int gcd(int a, int b) {
        // Nehme den Betrag, um negative Zahlen zu behandeln
        // gcd(a, b) = gcd(|a|, |b|)
        a = Math.abs(a);
        b = Math.abs(b);

        // Basisfall: ggT(a, 0) = a
        if (b == 0) {
            return a;
        }
        // Rekursiver Schritt: ggT(a, b) = ggT(b, a mod b)
        else {
            return gcd(b, a % b); // % ist der Modulo-Operator in Java
        }
    }

    public static void main(String[] args) {
        // Beispiel aus dem vorherigen Text
        int num1 = -435;
        int num2 = 306;
        int result1 = gcd(num1, num2);
        System.out.println("Der ggT von " + num1 + " und " + num2 + " ist: " + result1); // Erwartet: 3

        // Weiteres Beispiel
        int num3 = 72;
        int num4 = -23;
        int result2 = gcd(num3, num4);
        System.out.println("Der ggT von " + num3 + " und " + num4 + " ist: " + result2); // Erwartet: 7

        // Beispiel mit Teilerfremdheit
        int num5 = 17;
        int num6 = 23;
        int result3 = gcd(num5, num6);
        System.out.println("Der ggT von " + num5 + " und " + num6 + " ist: " + result3); // Erwartet: 1

        // Beispiel mit Null
        int num7 = 50;
        int num8 = 0;
        int result4 = gcd(num7, num8);
        System.out.println("Der ggT von " + num7 + " und " + num8 + " ist: " + result4); // Erwartet: 50
        
        int num9 = 0;
        int num10 = 60;
        int result5 = gcd(num9, num10);
        System.out.println("Der ggT von " + num9 + " und " + num10 + " ist: " + result5); // Erwartet: 60

        int num11 = 0;
        int num12 = 0;
        int result6 = gcd(num11, num12);
        System.out.println("Der ggT von " + num11 + " und " + num12 + " ist: " + result6); // Erwartet: 0

        int numVid1 = 156;
        int numVid2 = 66;
        int resultVid = gcd(numVid1, numVid2);
        System.out.println("Der ggT von " + numVid1 + " und " + numVid2 + " ist: " + resultVid); // Erwartet: 0
    }
}