import producerConsumer.Consumer;
import producerConsumer.Producer;

public class App {
    public static void main(String[] args) {
        new Thread(new Producer(),"Producer").start();
        new Thread(new Consumer(),"Consumer").start();
    }
}
