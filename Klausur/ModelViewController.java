/*
*   a. Beschreiben Sie das Model-View-Controller (MVC)-Muster.
*   
*   Das MVC-Muster trennt eine Anwendung in drei Komponenten:
*   Model (Daten und Logik), View (Darstellung) und Controller (Benutzereingaben).
*/

// Konzeptionelles Code-Beispiel:

// 1. Model: Hält die Daten
class StudentModel { String name; int id; }

// 2. View: Zeigt die Daten an
class StudentView {
    public void printStudentDetails(String name, int id) {
        System.out.println("Student: " + name + ", ID: " + id);
    }
}

// 3. Controller: Verbindet Model und View
class StudentController {
    private StudentModel model;
    private StudentView view;
    // ... Logik, um Model zu aktualisieren und View zu benachrichtigen
}