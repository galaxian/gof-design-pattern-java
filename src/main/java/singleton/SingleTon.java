package singleton;

public class SingleTon {
    private SingleTon() {

    }

    private static SingleTon singleTon;

    public static SingleTon getInstance() {
        if (singleTon == null) {
            singleTon = new SingleTon();
        }
        return singleTon;
    }
}
