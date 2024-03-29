package abstract_factory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AbstractFactoryTest {
    @Test()
    @DisplayName("MotorVehicle의 motor, wheel type 테스트")
    void MotorVehicle의_motor_wheel_type_테스트() {
        AbstractFactory abstractFactory;

        abstractFactory = FactoryProvider.getFactory("motor");
        Motor motor = abstractFactory.createMotor();
        Wheel wheel = abstractFactory.createWheel();

        assertThat(motor).isInstanceOf(MotorVehicleMotor.class);
        assertThat(motor).isNotInstanceOf(ElectricVehicleMotor.class);
        assertThat(wheel).isInstanceOf(MotorVehicleWheel.class);
        assertThat(wheel).isNotInstanceOf(ElectricVehicleWheel.class);
    }

    @Test()
    @DisplayName("ElectricVehicle의 motor, wheel type 테스트")
    void ElectricVehicle의_motor_wheel_type_테스트() {
        AbstractFactory abstractFactory;

        abstractFactory = FactoryProvider.getFactory("electric");
        Motor motor = abstractFactory.createMotor();
        Wheel wheel = abstractFactory.createWheel();

        assertThat(motor).isInstanceOf(ElectricVehicleMotor.class);
        assertThat(motor).isNotInstanceOf(MotorVehicleMotor.class);
        assertThat(wheel).isInstanceOf(ElectricVehicleWheel.class);
        assertThat(wheel).isNotInstanceOf(MotorVehicleWheel.class);
    }

    @Test()
    @DisplayName("MotorVehicle의 메서드 동작 테스트")
    void MotorVehicle의_메서드_동작_테스트() {
        AbstractFactory abstractFactory;

        abstractFactory = FactoryProvider.getFactory("motor");
        Motor motor = abstractFactory.createMotor();
        Wheel wheel = abstractFactory.createWheel();

        assertThat(motor.type()).isEqualTo("Motor");
        assertThat(wheel.type()).isEqualTo("Wheel");
    }

    @Test()
    @DisplayName("ElectricVehicle의 메서드 동작 테스트")
    void electricVehicle의_메서드_동작_테스트() {
        AbstractFactory abstractFactory;

        abstractFactory = FactoryProvider.getFactory("electric");
        Motor motor = abstractFactory.createMotor();
        Wheel wheel = abstractFactory.createWheel();

        assertThat(motor.type()).isEqualTo("Electric Motor");
        assertThat(wheel.type()).isEqualTo("Electric Wheel");
    }
}
