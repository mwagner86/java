/*
 Checked Exceptions (Geprüfte Ausnahmen)

    Was sie sind:
    Fehler, die typischerweise durch externe Umstände entstehen, auf die der Programmierer nur bedingt Einfluss hat
    (z.B. eine Datei existiert nicht, eine Netzwerkverbindung bricht ab).
    Sie repräsentieren oft Situationen, von denen sich das Programm potenziell erholen kann.

    Die Regel: Der Java-Compiler zwingt dich, diese Exceptions zu behandeln.
    Du musst sie entweder mit einem try-catch-Block abfangen oder mit dem throws-Schlüsselwort in der Methodensignatur deklarieren,
    dass deine Methode diesen Fehler weiterwerfen kann.

    Beispiel: IOException, FileNotFoundException, SQLException.

Unchecked Exceptions (Ungeprüfte Ausnahmen)

    Was sie sind:
    Fehler, die fast immer auf einen Programmierfehler oder eine fehlerhafte Logik zurückzuführen sind
    (z.B. Zugriff auf ein nicht-existierendes Objekt, Teilen durch null, Zugriff auf einen ungültigen Array-Index).

    Die Regel:
    Der Compiler zwingt dich nicht, diese Exceptions zu behandeln.
    Sie können zur Laufzeit (RuntimeException) auftreten und führen unbehandelt meist zum Programmabsturz.
    Man sollte sie in der Regel nicht abfangen, sondern den zugrundeliegenden Programmierfehler beheben.

    Beispiel: NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionBeispiel {

    public static void main(String[] args) {
        // --- Umgang mit einer CHECKED Exception ---
        // Der Aufruf von liesDatei() muss in einem try-catch-Block sein,
        // da der Compiler weiß, dass eine FileNotFoundException auftreten KANN.
        System.out.println("Versuche, eine Checked Exception zu behandeln...");
        try {
            liesDatei("nicht_existente_datei.txt");
        } catch (FileNotFoundException e) {
            System.err.println("FEHLER: Die Datei wurde nicht gefunden. Das ist eine Checked Exception.");
            // Das Programm kann hier sinnvoll weitermachen.
        }

        System.out.println("\n----------------------------------\n");

        // --- Auslösen von UNCHECKED Exceptions ---
        System.out.println("Löse nun Unchecked Exceptions aus...");
        
        // Beispiel 1: NullPointerException
        // Dieser Aufruf wird das Programm abstürzen lassen, wenn er nicht abgefangen wird.
        try {
            erzeugeNullPointerException();
        } catch(NullPointerException e) {
            System.err.println("FEHLER: Es wurde versucht, auf ein 'null'-Objekt zuzugreifen.");
        }

        // Beispiel 2: ArrayIndexOutOfBoundsException
        try {
            erzeugeArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("FEHLER: Es wurde auf einen ungültigen Array-Index zugegriffen.");
        }
    }

    /**
     * Methode, die eine CHECKED Exception auslösen kann.
     * Sie muss deklarieren, dass sie diesen Fehler weiterwirft (throws).
     */
    public static void liesDatei(String dateiname) throws FileNotFoundException {
        File datei = new File(dateiname);
        // Dieser Scanner-Konstruktor wirft eine FileNotFoundException, wenn die Datei nicht existiert.
        Scanner scanner = new Scanner(datei);
        scanner.close();
    }

    /**
     * Methode, die eine UNCHECKED Exception auslöst.
     * Sie muss nicht deklarieren, dass sie diesen Fehler werfen kann.
     */
    public static void erzeugeNullPointerException() {
        String text = null; // Das Objekt ist nicht initialisiert, es ist 'null'.
        // Der Versuch, eine Methode auf 'null' aufzurufen, führt zum Fehler.
        System.out.println(text.length()); 
    }
    
    /**
     * Methode, die eine weitere UNCHECKED Exception auslöst.
     */
    public static void erzeugeArrayIndexOutOfBoundsException() {
        int[] zahlen = new int[3]; // Gültige Indizes sind 0, 1, 2
        // Der Zugriff auf Index 3 ist ein Programmierfehler.
        System.out.println(zahlen[3]);
    }
}