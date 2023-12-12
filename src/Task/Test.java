package Task;

import java.util.Scanner;

public class Test {
    public int[] test(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введиет какое кол-личество чисел хотите ввести в массиве: ");
        final int SIZE_ARRAY = scanner.nextInt();
        int[] array = new int[SIZE_ARRAY];
        for (int i = 0; i < SIZE_ARRAY; i++) {
            System.out.print("[" + (i + 1) + "]" + " элемент: ");
            array[i]=scanner.nextInt();
        }
        return array;
    }
}
