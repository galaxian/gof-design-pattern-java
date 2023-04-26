package adapter;

public class Bus extends Transportation{
    public Bus(String name) {
        super(name);
    }

    @Override
    public void runnable() {
        System.out.println(name + " running");
    }
}
