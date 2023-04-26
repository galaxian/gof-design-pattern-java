package adapter;

public class Taxi extends Transportation{
    public Taxi(String name) {
        super(name);
    }

    @Override
    public void runnable() {
        System.out.println(name + " running");
    }
}
