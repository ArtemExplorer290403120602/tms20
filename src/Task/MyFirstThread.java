package Task;

import java.util.Arrays;

public class MyFirstThread extends Test implements Runnable {
    private int[] array;
    private int min;

    public MyFirstThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        min = Arrays.stream(array).min().orElse(0);
        System.out.println("Минимальный элемент: " + min);
    }
}
