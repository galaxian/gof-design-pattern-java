package factory_method;

public class HelicopterFactory extends AirVehicleFactory{
    @Override
    protected AirVehicle createAirVehicle() {
        return new Helicopter();
    }
}
