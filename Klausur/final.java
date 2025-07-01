/* Eine finale Klasse (final class) ist eine Klasse, die mit dem Schlüsselwort final deklariert wurde.
Von einer solchen Klasse kann nicht geerbt werden;
sie kann also keine Unterklassen haben.  */

// Deklaration einer finalen Klasse
final class SuperSecureClass {
    public void showInfo() {
        System.out.println("Diese Klasse ist final.");
    }
}

// Der folgende Code erzeugt einen Kompilierfehler:
// "cannot inherit from final SuperSecureClass"

class HackerAttempt extends SuperSecureClass {
// ...
}
