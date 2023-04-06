package factory_method;

public class Airplane implements AirVehicle{
    @Override
    public void build() {
        System.out.println("build airplane");
    }
}
