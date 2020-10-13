package producerConsumer;

public class Consumer extends Thread {
    public synchronized void run() {
        for (int i = 1; i < 6; i++) {
            BufferSingleton.getInstance().get();
        }
    }

}
