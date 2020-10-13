package producerConsumer;

import java.util.ArrayList;

public class Buffer {
    private static ArrayList<Integer> arrayList = new ArrayList<>();
    public static final int bufferSize = 5;

    public synchronized void get() {
        while (arrayList.size() == 0) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        System.out.println("Потребитель забрал продукт: "+ arrayList.remove(0));
        System.out.println("Продуктов в буфере: " + arrayList.size());
        notify();
    }
    public synchronized void put(int i) {
        while (arrayList.size()>= bufferSize) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        arrayList.add(i);
        System.out.println("Производитель произвёл продукт: " + i);
        System.out.println("Продуктов в буфере: " + arrayList.size());
        notify();
    }
}
