package homework4.exercise3;

public class Lamp implements Switchable, Dimmable {
    boolean isOn;
    int brightness;

    @Override
    public void turnOn() {
        isOn = true;
        dimToHalf();
    }

    @Override
    public void turnOff() {
        isOn = false;
        brightness = 0;
        System.out.println("The lamp is turned off.");
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setBrightness(int level) {
        if (!isOn) {
            System.out.println("The lamp is off. Please turn it on to set brightness.");
            return;
        }
        if (level < 0 || level > MAX_BRIGHTNESS) {
            System.out.println("Invalid brightness level. Please set a value between 0 and " + MAX_BRIGHTNESS + ".");
        } else {
            brightness = level;
            System.out.println("Brightness set to " + brightness + ".");
        }
    }

    @Override
    public int getBrightness() {
        return brightness;
    }

    @Override
    public void dimToHalf() {
        if (!isOn) {
            System.out.println("The lamp is off. Please turn it on to dim.");
            return;
        }
        brightness = MAX_BRIGHTNESS / 2;
        System.out.println("Brightness dimmed to half: " + brightness + ".");
    }


}
