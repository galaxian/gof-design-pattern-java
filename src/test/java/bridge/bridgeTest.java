package bridge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class bridgeTest {

    @Test
    @DisplayName("4칙연산 테스트 및 div 메서드 몫 계산 테스트")
    void 몫_계산테스트() {

        int a = 72;
        int b = 39;

        Calculator quotientCalculator = new Calculator(new QuotientCalculate());

        assertThat(quotientCalculator.add(a, b)).isEqualTo(a + b);
        assertThat(quotientCalculator.sub(a, b)).isEqualTo(a - b);
        assertThat(quotientCalculator.mul(a, b)).isEqualTo(a * b);

        assertThat(quotientCalculator.div(a, b)).isEqualTo(a / b);
    }

    @Test
    @DisplayName("4칙연산 테스트 및 div 메서드 나머지 계산 테스트")
    void 나머지_계산테스트() {

        int a = 7192;
        int b = 332;

        Calculator remainderCalculator = new Calculator(new RemainderCalculate());

        assertThat(remainderCalculator.add(a, b)).isEqualTo(a + b);
        assertThat(remainderCalculator.sub(a, b)).isEqualTo(a - b);
        assertThat(remainderCalculator.mul(a, b)).isEqualTo(a * b);

        assertThat(remainderCalculator.div(a, b)).isEqualTo(a % b);
    }
}
