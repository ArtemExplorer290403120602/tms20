package Task1;

import Task.Test;
import java.util.Arrays;

public class MyThreeThread extends Test implements Runnable {
    private int[] array;

    public MyThreeThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        System.out.println("Метод вставкой:");
        int n = array.length;

        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            // Сдвигаем все элементы arr[0..i-1], которые больше ключа, на одну позицию вперед
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        System.out.println(Arrays.toString(array));
    }
}

