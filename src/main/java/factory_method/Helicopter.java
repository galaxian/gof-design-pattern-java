package factory_method;

public class Helicopter implements AirVehicle{
    @Override
    public void build() {
        System.out.println("build helicopter");
    }
}
