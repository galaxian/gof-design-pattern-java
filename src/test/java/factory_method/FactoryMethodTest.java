package factory_method;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactoryMethodTest {
    @Test
    @DisplayName("airplane factory에서 생성한 airVehicle Instance의 타입 확인")
    void airplaneFactory_인스턴스의_타입확인() {
        AirVehicleFactory factory = new AirplaneFactory();
        AirVehicle airplane = factory.createAirVehicle();
        assertThat(airplane).isInstanceOf(AirVehicle.class);
        assertThat(airplane).isInstanceOf(Airplane.class);
    }
}
