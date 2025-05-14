package homework5.exercise1;

public class EComController {
    public static void main(String[] args) {
        ShippingInfo info = new ShippingInfo("Munich", 80331, "Germany");
        Profile profile = new Profile(info);
        Customer customer = new Customer(profile, 123);

        System.out.println ("Shipping to: " + customer.getProfile().getShippingInfo().getCity());
    }
}

/*
    2. Der Code ist ein Beispiel von Dependency Injection, weil
        Constructor Injection:
            die Klasse EComController eine Instanz von ShippingInfo erstellt und diese dann an die Profile-Klasse übergibt. Die Profile Klasse wird dann an die
            Customer-Klasse übergeben. Dies zeigt, dass die Abhängigkeiten über den Konstruktor übergebem werdem und so die Abhängigkeiten zur Laufzeit bereitgestellt werden,
            anstatt dass sie in den Klassen selbst erstellt werden.
        Setter / Getter Injection:
            Bei der Ausgabe werden Getter-Methoden verwendet, um die Attribute der Klassen zu erhalten. Dies ist eine gute Praxis, da es die Kapselung fördert und
            die Flexibilität erhöht.
        erfüllt wprden sind.

    3. Der Code bricht die Law of Demeter an folgender Stelle: "customer.getProfile().getShippingInfo().getCity()". Hier findet eine Verkettung von Methoden statt, was bedeutet,
        dass die Klasse EComController von der Struktur mehrer anderer Klassen abhängt.
        Lösung: Die Verantworlichkeit (Abfrage der Stadt) sollte in die Klasse Costumer verschoben werden. Die Logik bleibt dort, wo sie hingehört. Zudem muss die Klasse EComController
        keine Details der internen Strukturen der drei Klassen kennen. Außerdem erhöht es die Wartbarkeit des Codes, da Änderungen an den Klassen keine Änderungen im Controller benötigen.
 */