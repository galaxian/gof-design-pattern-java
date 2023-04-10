package abstract_factory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AbstractFactoryTest {
    @Test()
    @DisplayName("d")
    void test1() {
        AbstractFactory abstractFactory;

        abstractFactory = FactoryProvider.getFactory("motor");
        Motor motor = abstractFactory.createMotor();
        Wheel wheel = abstractFactory.createWheel();

        assertThat(motor.type()).isEqualTo("Motor");
        assertThat(motor).isInstanceOf(MotorVehicleMotor.class);
    }
}
