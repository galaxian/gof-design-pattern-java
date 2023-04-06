package factory_method;

public abstract class AirVehicleFactory {
    public AirVehicle create() {
        AirVehicle vehicle = createAirVehicle();
        vehicle.build();
        return vehicle;
    }

    protected abstract AirVehicle createAirVehicle();
}
