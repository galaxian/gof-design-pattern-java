package singleton;

public class HolderSingleTon {
    private HolderSingleTon() {

    }

    private static class SingleTonInstanceHolder {
        private static final HolderSingleTon INSTANCE = new HolderSingleTon();
    }

    public static HolderSingleTon getInstance() {
        return SingleTonInstanceHolder.INSTANCE;
    }
}
