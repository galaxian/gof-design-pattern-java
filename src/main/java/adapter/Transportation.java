package adapter;

public abstract class Transportation {
    protected String name;

    public Transportation(String name) {
        this.name = name;
    }

    public abstract void runnable();
}
