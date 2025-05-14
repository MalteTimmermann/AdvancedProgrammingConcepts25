package homework5.exercise3;

public class Calculator {
    public static double divide1(int a, int b){
        try {
            return a/b;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
    }

    public static double divide2(int a, int b) throws ArithmeticException{
        return a/b;
    }


    public static void main(String[] args){

        System.out.println(Calculator.divide1(3,0));

        try {
            System.out.println(Calculator.divide2(3,0));
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }
    }
}

/*
    b) Die Methode "divide1" macht hier mehr Sinn, da die Exception innerhalb der Methode behandelt wird und
       somit der Aufrufer nicht gezwungen ist, die Exception abzufangen. Die Logik bleibt somit in der Methode
       und die Abhängigkeit (Enkapslung) vom Aufrufer wird reduziert. Zudem macht es die Methode in einem solchen
       simplen Programm fehlertoleranter.

    c) Die Methode "divide2" macht mehr Sinn, wenn man das Exception-Handling an den Aufrufer übergeben möchte,
       dieses somit von Aufrufer zu Aufrufer unterschiedliche ist. Zudem kann es ein Vorteil sein, Exceptions
       an höhere Ebenen weiterzugeben, um eine zentralisierte Fehlerbehandlung zu ermöglichen und dieses zu monitoren.
 */
