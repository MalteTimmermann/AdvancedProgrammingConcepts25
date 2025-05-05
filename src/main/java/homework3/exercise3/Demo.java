package homework3.exercise3;

public class Demo {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        lamp.turnOn();
        lamp.setBrightness(80);
        lamp.dimToHalf();
        System.out.println("Brightness: " + lamp.getBrightness());
    }
}
