// 1. Das Interface (der Vertrag)
// Definiert, dass jedes "fahrbare" Ding eine Geschwindigkeit haben und sich bewegen muss.
interface Fahrbar {
    // Konstante (automatisch public static final)
    int MAX_GESCHWINDIGKEIT = 250;

    // Abstrakte Methoden (der eigentliche Vertrag)
    void beschleunigen(int Zuwachs);
    void bremsen(int Abnahme);
    int getGeschwindigkeit();
}

// 2. Eine Klasse, die den Vertrag erfüllt
class Auto implements Fahrbar {
    private int aktuelleGeschwindigkeit = 0;

    @Override
    public void beschleunigen(int Zuwachs) {
        this.aktuelleGeschwindigkeit += Zuwachs;
        System.out.println("Auto beschleunigt auf " + this.aktuelleGeschwindigkeit + " km/h.");
    }

    @Override
    public void bremsen(int Abnahme) {
        this.aktuelleGeschwindigkeit -= Abnahme;
        System.out.println("Auto bremst auf " + this.aktuelleGeschwindigkeit + " km/h.");
    }
    
    @Override
    public int getGeschwindigkeit() {
        return this.aktuelleGeschwindigkeit;
    }
}

// 3. Eine weitere Klasse, die denselben Vertrag erfüllt
class Fahrrad implements Fahrbar {
    private int trittfrequenz = 0;

    @Override
    public void beschleunigen(int Zuwachs) {
        this.trittfrequenz += Zuwachs;
        System.out.println("Fahrrad tritt schneller: " + this.trittfrequenz);
    }

    @Override
    public void bremsen(int Abnahme) {
        this.trittfrequenz -= Abnahme;
        System.out.println("Fahrrad tritt langsamer: " + this.trittfrequenz);
    }
    
    @Override
    public int getGeschwindigkeit() {
        // Vereinfachte Berechnung
        return this.trittfrequenz * 2;
    }
}

// 4. Verwendung über das Interface (Polymorphismus)
class Testfahrt {
    public static void main(String[] args) {
        // Variable vom Typ des Interfaces
        Fahrbar meinFahrzeug = new Auto();
        meinFahrzeug.beschleunigen(50); // Ausgabe: Auto beschleunigt auf 50 km/h.

        // Das Fahrzeug wird gewechselt, die Variable bleibt dieselbe
        meinFahrzeug = new Fahrrad();
        meinFahrzeug.beschleunigen(10); // Ausgabe: Fahrrad tritt schneller: 10
        System.out.println("Fahrradgeschwindigkeit: " + meinFahrzeug.getGeschwindigkeit() + " km/h.");
    }
}