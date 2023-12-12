package Task;

import java.util.Arrays;

public class MySecondThread extends Test implements Runnable {
    private int[] array;
    private int max;

    public MySecondThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        max = Arrays.stream(array).max().orElse(0);
        System.out.println("Максимальный элемент: " + max);
    }
}
