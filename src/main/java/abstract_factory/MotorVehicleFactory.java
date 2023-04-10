package abstract_factory;

public class MotorVehicleFactory extends AbstractFactory {
    @Override
    Motor createMotor() {
        return new MotorVehicleMotor();
    }

    @Override
    Wheel createWheel() {
        return new MotorVehicleWheel();
    }
}
