package Task1;

import Task.Test;
import java.util.Arrays;

public class MyFirstThread extends Test implements Runnable{
    private int[] array;

    public MyFirstThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        System.out.println("Метод пузырьком: ");
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
