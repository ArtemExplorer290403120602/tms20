package Task1;
//Сортировка массива цифр в нескольких потоках различными алгоритмами:
//- сортировка вставками;
//- сортировка выбором;
//- сортировка пузырьком.
//Каждый вид сортировки должен запускаться в отдельном потоке. После вывести
//результат отсортированных массивов в консоль.
public class Main {
    public static void main(String[] args) {
        TestOne test=new TestOne();
        int[] array=test.test();
        MyFirstThread myFirstThread=new MyFirstThread(array);
        MySecondThreat mySecondThreat=new MySecondThreat(array);
        MyThreeThread myThreeThread=new MyThreeThread(array);
        Thread thread1=new Thread(myFirstThread);
        Thread thread2=new Thread(mySecondThreat);
        Thread thread3=new Thread(myThreeThread);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
