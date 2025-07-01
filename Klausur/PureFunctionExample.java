//  Eine reine Funktion (pure function) ist eine Funktion, die zwei Bedingungen erfüllt:
//
//  Ihr Rückgabewert hängt ausschließlich von ihren Eingabewerten ab. Für dieselbe Eingabe liefert sie immer dieselbe Ausgabe.
//
//  Sie hat keine beobachtbaren Seiteneffekte (side effects). Das bedeutet, sie verändert keine Zustände außerhalb ihres eigenen Geltungsbereichs.
//  (z.B. globale Variablen, Dateien oder Konsolenausgaben).

class FunctionExample {
    // Reine Funktion: Das Ergebnis hängt nur von 'a' und 'b' ab.
    public int sum(int a, int b) {
        return a + b;
    }

    private int externalValue = 0;

    // Unreine Funktion: Sie hat einen Seiteneffekt (verändert 'externalValue').
    public int impureSum(int a, int b) {
        this.externalValue = a + b; // Seiteneffekt
        return this.externalValue;
    }
}

public class PureFunctionExample {
    public static void main(String[] args) {
        FunctionExample example = new FunctionExample();

        // Reine Funktion
        int result1 = example.sum(3, 5);
        System.out.println("Reine Funktion Ergebnis: " + result1); // Ausgabe: 8

        // Unreine Funktion
        int result2 = example.impureSum(3, 5);
        System.out.println("Unreine Funktion Ergebnis: " + result2); // Ausgabe: 8
    }
}