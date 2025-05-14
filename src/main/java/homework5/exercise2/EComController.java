package homework5.exercise2;

public class EComController {
    public static void main(String[] args) {

        ShippingInfo info = null;
        try {
            info = new ShippingInfo("Munich", 80331, "Germany");
        } catch (InvalidShippingInfoException e) {
            System.out.println("Invalid shipping info: " + e.getMessage());
            System.exit(1);
        }

        Profile profile = null;
        try {
            profile = new Profile(info);
        } catch (MissingShippingInfoException e) {
            System.out.println("Missing shipping info: " + e.getMessage());
            System.exit(1);
        }

        Customer customer = null;
        try {
            customer = new Customer(profile, 123);
        } catch (InvalidCustomerException e) {
            System.out.println("Invalid customer: " + e.getMessage());
            System.exit(1);
        }

        System.out.println ("Shipping to: " + customer.getProfile().getShippingInfo().getCity());
    }
}

/*
    1. Dann muss der Aufrufer der Methode die Exception abfangen. Sollte dies auch nicht der Fall sein (in den
       IDEs ist diese Implementation nicht möglich (Programm nicht ausführbar)) führt die Exception zu einem direkten
       Abbruch des Programms.

    2. Spezifische Excpetions bringen mehrere Vorteile mit sich: Zu einem erhöht es die Granularität in der
       Fehlerbehandlung und ermöglich differenziertes Excpetion Handling. Zudem verbessert es die Lesbarkeit des Codes
       und die Testbarkeit, da spezifische Exceptions gezielt behandelt werden können.

    3. Try-with-resources-Blöcke sollten dann verwendet werden, wenn mit ressourcenbasierten Objekten gearbeitet wird.
       Das bedeutet, dass sichergestellt wird das zum Beispiel Data-Streams nach dem Abfangen einer Exception korrekt
       geschlossen werden. Es im Gegensatz zu einem normalen Try-Block mit der Nutzung von "finaly" eine schönerere
       Implementation.
 */