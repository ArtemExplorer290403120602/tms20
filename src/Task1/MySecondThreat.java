package Task1;

import Task.Test;

public class MySecondThreat extends Test implements Runnable {
    private int[] array;

    public MySecondThreat(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        System.out.println("Метод выбором: ");
        int min;
        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                final int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
            System.out.print(array[i] + " ");
        }
    }
}
