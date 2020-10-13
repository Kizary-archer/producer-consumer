package producerConsumer;

public class BufferSingleton {
    private static Buffer buffer;

    private BufferSingleton() {
    }

    public static Buffer getInstance() {
        if (buffer == null) buffer = new Buffer();
        return buffer;
    }
}
