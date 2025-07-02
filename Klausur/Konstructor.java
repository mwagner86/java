/*
Ein Konstruktor (constructor) ist eine spezielle Methode,

die zur Erzeugung und Initialisierung eines Objekts dient und sicherstellt,

dass es sich in einem gültigen Anfangszustand befindet.
*/

class Buch {
    String titel;
    String autor;

    // Konstruktor zur Initialisierung eines Buch-Objekts
    public Buch(String titel, String autor) {
        this.titel = titel;
        this.autor = autor;
    }
}

// Verwendung: Buch meinBuch = new Buch("Der Herr der Ringe", "J.R.R. Tolkien");