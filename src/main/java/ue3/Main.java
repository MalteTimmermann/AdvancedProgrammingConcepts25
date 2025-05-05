package ue3;

/*
    a) Funktioniert A (new Book("Title")), da der Konstruktor mit dem Parameter title
       aufgerufen wird. Der Konstruktor mit dem Parameter title ist public, daher kann er
       von außen aufgerufen werden. Da es nicht zugewiesen wird, wird es von der Garbage Collection wieder entfernt.

    b)

    c)

    d) B ist richtig, da Aliasing in Java beschreibt, dass mehrere Variablen auf das selbe Objekt verweisen.

    e) C ist richtig, da eine final Variable genau einmal einen Wert zugewiesen bekommen soll.

    f) C ist richtig, da es alle nicht erreichbaren Objekte entfernt. Es wird automatisch ausgeführt von der JVM.

    g) Das Beispiel zeigt ein valides Konstruktor Overloading, da die Konstruktoren unterschiedliche Parameter besitzen.

2.
    a) Die Methode kann nicht überschrieben werden, da sie in der Elternklasse final ist -> StaticBinding. Die Variablen
       können überschrieben werden, da sie nicht final sind -> DynamicBinding.

    b) Die final primitive Variable verbietet es, den Wert nach einer einmaligen Initialisierung zu ändern. Die final
       Referenzvariable verbietet es, die Referenz auf ein anderes Objekt zu ändern. Der Inhalt des Objektes kann
       jedoch weiterhin verändert werden.

    c) Final Variablen müssen entweder bei der Deklaration initialisiert werden oder im Konstruktor der Klasse.
       In einer Methode kann diese nicht mehr initialisiert werden.

*/


public class Main {
    public static void main(String[] args) {



    }
}
