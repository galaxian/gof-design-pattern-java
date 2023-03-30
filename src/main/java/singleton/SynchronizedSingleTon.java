package singleton;

public class SynchronizedSingleTon {
    private SynchronizedSingleTon(){

    }

    private static SynchronizedSingleTon instance;

    public static synchronized SynchronizedSingleTon getInstance() {
        if (instance == null) {
            instance = getInstance();
        }
        return instance;
    }
}
