package decorator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DecoratorTest {
    @Test
    @DisplayName("1줄 텍스트 문자열 조회 및 유효범위 row 테스트")
    void test1() {
        String test = "Decorator Pattern Test";
        SingleText singleText = new SingleText(test);

        assertThat(singleText.getRowText(0)).isEqualTo(test);
        assertThat(singleText.getRowText(1)).isEqualTo(null);
    }
}
