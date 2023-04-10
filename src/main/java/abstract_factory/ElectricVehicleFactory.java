package abstract_factory;

public class ElectricVehicleFactory extends AbstractFactory {
    @Override
    Motor createMotor() {
        return new ElectricVehicleMotor();
    }

    @Override
    Wheel createWheel() {
        return new ElectricVehicleWheel();
    }
}
