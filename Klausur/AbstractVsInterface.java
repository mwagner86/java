/* Abstrakte Klassen vs. Interfaces

Eine abstrakte Klasse (abstract class) ist eine Basisklasse,

die nicht instanziiert werden kann und sowohl implementierte als auch abstrakte Methoden enthalten kann.

Ein Interface ist ein reiner Vertrag, der nur Methodensignaturen (und seit Java 8 default-Methoden) definiert und die mehrfache Implementierung erlaubt.
*/


// Interface definiert eine Fähigkeit
interface Fahrbar {
    void fahre();
}

// Abstrakte Klasse als allgemeine Basis
abstract class Fahrzeug {
    private int anzahlRaeder;

    public Fahrzeug(int anzahlRaeder) {
        this.anzahlRaeder = anzahlRaeder;
    }

    // Eine bereits implementierte Methode
    public int getAnzahlRaeder() {
        return anzahlRaeder;
    }
}

// Konkrete Klasse erbt von der abstrakten Klasse und implementiert das Interface
class Auto extends Fahrzeug implements Fahrbar {
    public Auto() {
        super(4); // Konstruktor der Oberklasse aufrufen
    }

    @Override
    public void fahre() {
        System.out.println("Das Auto mit " + getAnzahlRaeder() + " Rädern fährt.");
    }
}