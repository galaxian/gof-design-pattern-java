package abstract_factory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String element) {
        if("Electric".equalsIgnoreCase(element)) {
            return new ElectricVehicleFactory();
        }
        else if("Motor".equalsIgnoreCase(element)) {
            return new MotorVehicleFactory();
        }
        return null;
    }
}
