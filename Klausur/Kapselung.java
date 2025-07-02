/*
Kapselung (encapsulation) ist das Bündeln von Daten (Attributen) und Methoden in einer Klasse,

wobei der direkte Zugriff auf die Daten durch private-Modifier verhindert wird (Data Hiding).
*/

class Person {
    // Daten sind private und von außen nicht direkt zugänglich
    private String name;
    private int alter;

    // Öffentliche Methoden (Getter/Setter) bieten kontrollierten Zugriff
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        if (alter >= 0) { // Validierung
            this.alter = alter;
        } else {
            System.out.println("Alter muss positiv sein.");
        }
    }
}