/*
Lambda-Ausdrücke in GUIs: Event-Handling

Die Problemstellung:
In einer grafischen Benutzeroberfläche (GUI) möchtest du auf eine Aktion des Benutzers reagieren,
zum Beispiel auf einen Klick auf einen Button. In Java geschieht dies durch sogenannte Event-Listener.

Der klassische Weg (vor Java 8): Anonyme Innere Klassen
Früher musste man für jeden Listener eine "anonyme innere Klasse" erstellen.
Das bedeutet, man hat direkt bei der Zuweisung eine namenlose Klasse erzeugt, die das notwendige Interface (z.B. ActionListener) implementiert.
Dieser Ansatz ist sehr "geschwätzig" (verbose) und bläht den Code mit Syntax auf, die vom eigentlichen Ziel ablenkt.

Der moderne Weg (mit Lambdas): Klare Aktionen
Die meisten Event-Listener in Java sind funktionale Interfaces – sie haben nur eine einzige abstrakte Methode,
die implementiert werden muss (z.B. hat ActionListener nur die Methode actionPerformed).

Genau hier kommen Lambdas ins Spiel!
Ein Lambda-Ausdruck kann eine kurze, direkte Implementierung für genau diese eine Methode liefern.
Anstatt eine ganze Klasse zu definieren, schreibst du nur den Code, der tatsächlich ausgeführt werden soll.

Der Fokus liegt auf der Aktion, nicht auf der Syntax.

*/

import javax.swing.*;
import java.awt.FlowLayout;

public class GuiLambdaBeispiel {

    public static void main(String[] args) {
        // Erstellt das Hauptfenster
        JFrame frame = new JFrame("Lambda in GUI Beispiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(new FlowLayout());

        // --- 1. Der klassische Weg: Anonyme Innere Klasse ---
        JButton classicButton = new JButton("Klassischer Button");
        
        // Hier wird eine komplette, namenlose Klasse erzeugt, nur um eine einzige Methode zu implementieren.
        classicButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Klassischer Button geklickt! (Viel Code für eine kleine Aktion)");
            }
        });

        // --- 2. Der moderne Weg: Lambda-Ausdruck ---
        JButton lambdaButton = new JButton("Lambda Button");

        // Der Lambda-Ausdruck stellt nur den Code für die actionPerformed-Methode bereit.
        // Die Parameterliste (e) wird vom Compiler abgeleitet.
        // Der Code ist kurz, direkt und auf die Aktion fokussiert.
        lambdaButton.addActionListener(e -> {
            System.out.println("Lambda Button geklickt! (Kurz und prägnant)");
        });

        // Füge die Buttons zum Fenster hinzu
        frame.add(classicButton);
        frame.add(lambdaButton);

        // Mache das Fenster sichtbar
        frame.setVisible(true);
    }
}