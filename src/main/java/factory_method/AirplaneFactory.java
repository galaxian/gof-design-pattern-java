package factory_method;

public class AirplaneFactory extends AirVehicleFactory{
    @Override
    protected AirVehicle createAirVehicle() {
        return new Airplane();
    }
}
