import java.util.Random;

public class RandomArray {
    private int length;
    public RandomArray(int len) {
        this.length = len;
    }
    public RandomArray() {
        this.length = 10;
    }
    public int[] nextInt(int min, int max) {
        int []res = new int[length];
        for (int i = 0; i <= length - 1; i++) {
            res[i] = new Random().nextInt(min, max);
        }
        return res;
    }
    public int[] nextInt() {
        int []res = new int[length];
        for (int i = 0; i <= length; i++) {
            res[i] = new Random().nextInt(0, 51);
        }
        return res;
    }
    public float[] nextFloat(float min, float max) {
        float []res = new float[length];
        for (int i = 0; i <= length - 1; i++) {
            res[i] = new Random().nextFloat(min, max);
        }
        return res;
    }
    public float[] nextFloat() {
        float []res = new float[length];
        for (int i = 0; i <= length; i++) {
            res[i] = new Random().nextFloat(0, 51);
        }
        return res;
    }
}
