/*
    Instanziierung (instantiation) ist der Prozess,
    bei dem aus einer Klasse ein konkretes Objekt erzeugt wird, meist mit dem new-Schlüsselwort.
*/

// 1. Definition einer Klasse
class Greeter {
    private String message = "Hallo Welt!";

    public void sayHello() {
        System.out.println(message);
    }
}

class Instanziierung {
    public static void main(String[] args) {
        // 2. Instanziierung der Greeter-Klasse
        Greeter myGreeter = new Greeter();

        // Aufruf einer Methode auf dem erzeugten Objekt
        myGreeter.sayHello(); // Ausgabe: Hallo Welt!
    }
}