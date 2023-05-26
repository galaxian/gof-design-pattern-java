package facade;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();

        String name = "Robert";

        facade.run(name);
    }
}
