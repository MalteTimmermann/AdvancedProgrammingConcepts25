package homework4.exercise3;

public interface Dimmable {
    int MAX_BRIGHTNESS = 100;
    void setBrightness(int Level);
    int getBrightness();
    default void dimToHalf(){
        setBrightness(MAX_BRIGHTNESS / 2);
        System.out.println("Brightness dimmed to half: " + getBrightness() + ".");
    }

}
