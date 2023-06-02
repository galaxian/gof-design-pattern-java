package flyweight;

public class Computer implements ElectronicAppliance{

    private String color;
    private Controller controller;

    public Computer(Controller controller, String color) {
        this.color = color;
        this.controller = controller;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void on() {
        controller.on();
    }

    @Override
    public void off() {
        controller.off();
    }

    @Override
    public String getColor() {
        return color;
    }
}
