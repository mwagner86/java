/* Wie werden Ereignisse in GUI-Toolkits behandelt?

GUI-Toolkits nutzen ein ereignisgesteuertes Modell (event-driven) mit
Ereignisquellen,
Ereignisobjekten und 
Ereignis-Listenern.
*/


// Code-Beispiel (Java Swing): 

import javax.swing.*;
import java.awt.event.*;

public class GuiEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Beispiel");
        JButton button = new JButton("Klick mich!");
        frame.add(button);

        // Event-Listener wird dem Button hinzugefügt
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button wurde geklickt!");
            }
        });

        frame.setSize(200, 100);
        frame.setVisible(true);
    }
}