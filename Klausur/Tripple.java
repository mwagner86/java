/* 
Generische Klasse Tripple<T, U, V>

Diese Klasse repräsentiert ein Tripel von Werten, die jeweils unterschiedliche Typen haben können.
Die Typen T, U und V werden als generische Typen definiert, was bedeutet
dass die Klasse mit beliebigen Datentypen instanziiert werden kann.
Die Klasse enthält drei private Felder für die Werte, einen Konstruktor zur Initialisierung dieser Felder
und eine toString-Methode zur Ausgabe der Werte in einem lesbaren Format.
*/

public class Tripple <T, U, V> {
    private T frist;
    private U second;
    private V third;

    public Tripple(T first, U second, V third) {
        this.frist = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public String toString() {
        return "Tripple{" +
                "frist=" + frist +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}