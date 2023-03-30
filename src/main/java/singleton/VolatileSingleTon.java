package singleton;

public class VolatileSingleTon {
    private static volatile VolatileSingleTon instance;

    private VolatileSingleTon() {

    }

    public static VolatileSingleTon getInstance() {
        if (instance == null) {
            synchronized (VolatileSingleTon.class) {
                if (instance == null) {
                    instance = new VolatileSingleTon();
                }
            }
        }
        return instance;
    }
}
