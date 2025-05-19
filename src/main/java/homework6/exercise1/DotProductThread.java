package homework6.exercise1;

public class DotProductThread extends Thread{
    private final int[] v1;
    private final int[] v2;
    private int dot;

    public DotProductThread(int[] v1, int[] v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    @Override
    public void run() {
        dot = 0;
        for (int i = 0; i < v1.length; i++) {
            dot += v1[i] * v2[i];
        }
    }

    public int getDot() {
        return dot;
    }

}
