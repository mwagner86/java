/*
    Late Binding (auch dynamic binding oder späte/dynamische Bindung)
    ist der Mechanismus,
    bei dem erst zur Laufzeit entschieden wird, welche konkrete Methode ausgeführt wird. 

    Wenn eine Methode auf einer Objektreferenz der Oberklasse aufgerufen wird,
    ermittelt die JVM die tatsächliche Klasse des Objekts und ruft dessen überschriebene Methode auf. Dies ist die Grundlage für 
    Polymorphismus (polymorphism).
*/

class Animal {
    public void makeSound() {
        System.out.println("Ein Tier macht ein Geräusch.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Wuff!");
    }
}

class AnimalMain {
    public static void main(String[] args) {
        // Die Variable ist vom Typ Animal, das Objekt aber ein Dog.
        Animal myAnimal = new Dog(); 
        // Late Binding: Zur Laufzeit wird die makeSound() Methode von Dog aufgerufen.
        myAnimal.makeSound(); // Ausgabe: Wuff!
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound(); //Ausgabe: Ein Tier macht ein Geräusch.
    }
}
/*         
    Late Binding ermöglicht es, dass die Methode makeSound()
    zur Laufzeit auf die korrekte Implementierung in der Dog-Klasse verweist
    und nicht auf die in der Animal-Klasse, obwohl die Referenz vom Typ Animal
    ist. Dies ist besonders nützlich in Situationen, in denen die genaue Klasse
    zur Laufzeit bestimmt wird, z.B. in einer Sammlung von Tieren,
    die verschiedene Arten von Tieren enthalten kann.
    Hier wird Late Binding verwendet, um die Methode makeSound() der jeweiligen Klasse aufzurufen.
    Dies ermöglicht eine flexible und erweiterbare Architektur,
    da neue Tierarten hinzugefügt werden können, ohne den bestehenden Code zu ändern.
    Late Binding ist ein zentrales Konzept in der objektorientierten Programmierung,
    das es ermöglicht, dass Methodenaufrufe zur Laufzeit auf die korrekte
    Implementierung verweisen, basierend auf dem tatsächlichen Typ des Objekts,
    und nicht auf dem Typ der Referenzvariable.
    Dies fördert die Flexibilität und Wiederverwendbarkeit des Codes.
*/