/*
a. Statische vs. Dynamische Bindung

Statische Bindung (static binding) geschieht zur Kompilierzeit (z.B. bei überladenen Methoden).

Dynamische Bindung (dynamic binding) geschieht zur Laufzeit und ist die Grundlage für Polymorphismus (bei überschriebenen Methoden).

Code-Beispiel (Dynamische Bindung):
*/

class Tier {
    void sprich() { System.out.println("Tier spricht"); }
}
class Hund extends Tier {
    @Override
    void sprich() { System.out.println("Wuff!"); }
}

class StaticVsDynamicBinding {
    public static void main(String[] args) {
        Tier meinTier = new Hund();
        // Dynamische Bindung: Zur Laufzeit wird Hund.sprich() ausgewählt.
        meinTier.sprich(); // Ausgabe: Wuff!
    }
}