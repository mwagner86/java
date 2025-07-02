/*
Das Singleton-Pattern (singleton pattern) ist ein Entwurfsmuster, das sicherstellt,

dass von einer Klasse nur eine einzige Instanz existiert und einen globalen Zugriffspunkt darauf bereitstellt.

Ein privater Konstruktor verhindert die Instanziierung von außen, und eine statische Methode gibt die einzige Instanz zurück.
Es wird häufig für Ressourcen wie Datenbankverbindungen oder Konfigurationen verwendet, um sicherzustellen
dass nur eine Instanz im gesamten Programm existiert und um unnötige Ressourcen zu sparen
und Synchronisationsprobleme zu vermeiden.
*/

class DatenbankVerbindung {
    // Die einzige Instanz der Klasse
    private static DatenbankVerbindung instanz = new DatenbankVerbindung();

    // Privater Konstruktor verhindert Instanziierung von außen
    private DatenbankVerbindung() {}

    // Globale Zugriffsmethode
    public static DatenbankVerbindung getInstanz() {
        return instanz;
    }
}