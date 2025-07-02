/* Was bedeutet Überladen von Methoden?

Methodenüberladung (method overloading) bedeutet, mehrere Methoden mit demselben Namen,

aber unterschiedlichen Parameterlisten in derselben Klasse zu definieren. */

class Rechner {
    // Methode 1: Addiert zwei ganze Zahlen
    public int addiere(int a, int b) {
        return a + b;
    }

    // Methode 2: Überladen mit double-Parametern
    public double addiere(double a, double b) {
        return a + b;
    }
}