/*
Ein Interface (interface) kann von einem oder mehreren anderen Interfaces erben,
indem es das Schlüsselwort extends verwendet. Es erbt dabei alle Methodendefinitionen.
Eine Klasse, die das abgeleitete Interface implementiert,
muss dann alle Methoden aus der gesamten Hierarchie implementieren.
*/

interface CanFly {
    void fly();
}

// Dieses Interface erbt von CanFly
interface CanFight extends CanFly {
    void fight();
}

// Diese Klasse muss Methoden von CanFight UND CanFly implementieren.
class Superhero implements CanFight {
    @Override
    public void fight() {
        System.out.println("Kämpft gegen das Böse.");
    }

    @Override
    public void fly() {
        System.out.println("Fliegt durch die Lüfte.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Superhero hero = new Superhero();
        hero.fight(); // Ausgabe: Kämpft gegen das Böse.
        hero.fly();   // Ausgabe: Fliegt durch die Lüfte.
    }
}