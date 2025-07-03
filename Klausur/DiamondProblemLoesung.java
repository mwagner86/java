/* 
Das Diamond Problem mit default-Methoden

Dieser Code zeigt, was passiert,
wenn eine Klasse zwei Interfaces mit einer widersprüchlichen default-Methode implementiert.
*/

// Erstes Interface mit einer default-Methode
interface Radio {
    default void anschalten() {
        System.out.println("Radio ist angeschaltet.");
    }
}

// Zweites Interface mit einer widersprüchlichen default-Methode
interface Fernseher {
    default void anschalten() {
        System.out.println("Fernseher ist angeschaltet.");
    }
}

// Diese Klasse versucht, beide Interfaces zu implementieren.
// Der folgende Code würde ohne eine Überschreibung einen KOMPILIERFEHLER verursachen:
// "SmartTV erbt nicht verwandte Defaults für anschalten() von den Typen Radio und Fernseher"
class SmartTV implements Radio, Fernseher {

    // Um den Konflikt zu lösen, MÜSSEN wir die anschalten()-Methode überschreiben.
    // Dies zwingt den Programmierer, eine explizite Wahl zu treffen.
    @Override
    public void anschalten() {
        // Option 1: Eine komplett neue Implementierung bereitstellen.
        System.out.println("SmartTV startet...");

        // Option 2 (Alternativ): Explizit wählen, welche default-Methode verwendet werden soll.
        // Radio.super.anschalten(); // Dies würde die default-Methode von Radio aufrufen.
    }
}

public class DiamondProblemLoesung {
    public static void main(String[] args) {
        SmartTV meinFernseher = new SmartTV();
        meinFernseher.anschalten(); // Führt die überschriebene Methode in SmartTV aus
    }
}