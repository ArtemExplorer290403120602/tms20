package Task;
//Пользователь вводит с клавиатуры значение в массив. После чего запускаются два
//потока. Первый поток находит максимум в массиве, второй — минимум. Результаты
//вычислений возвращаются в метод main().
public class Main {
    public static void main(String[] args) {
        Test test=new Test();
        int[] array=test.test();
        MyFirstThread myFirstThread = new MyFirstThread(array);
        MySecondThread mySecondThread = new MySecondThread(array);
        Thread thread1 = new Thread(myFirstThread);
        Thread thread2 = new Thread(mySecondThread);
        thread1.start();
        thread2.start();
    }
}
