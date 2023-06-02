package flyweight;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class flyweightTest {
    @Test()
    @DisplayName("다른 flyweight 객체끼리 not Equal 테스트")
    void test1() {
        ElectronicAppliance whiteComputer = ElectronicFactory.createElectronic("white");
        ElectronicAppliance blackComputer = ElectronicFactory.createElectronic("black");

        assertThat(whiteComputer).isNotNull();
        assertThat(blackComputer).isNotNull();
        assertThat(whiteComputer).isNotEqualTo(blackComputer);
    }

    @Test()
    @DisplayName("같은 flyweight 객체끼리 equal 테스트")
    void test2() {
        ElectronicAppliance whiteComputer = ElectronicFactory.createElectronic("white");
        ElectronicAppliance anotherWhiteComputer = ElectronicFactory.createElectronic("white");

        assertThat(whiteComputer).isNotNull();
        assertThat(anotherWhiteComputer).isNotNull();
        assertThat(whiteComputer).isEqualTo(anotherWhiteComputer);
    }
}
