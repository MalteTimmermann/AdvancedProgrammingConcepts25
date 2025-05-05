package homework4.exercise3;

public interface Dimmable {
    int MAX_BRIGHTNESS = 100;
    void setBrightness(int Level);
    int getBrightness();
    void dimToHalf();

}
