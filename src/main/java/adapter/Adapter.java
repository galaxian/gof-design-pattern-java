package adapter;

public class Adapter extends Transportation{
    private Airplane airplane;

    public Adapter(String name) {
        super(name);

        airplane = new Airplane();
        airplane.setName(name);
    }

    @Override
    public void runnable() {
        System.out.println(airplane.getName() + " " + airplane.flyable());
    }
}
