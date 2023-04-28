package decorator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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

    @Test
    @DisplayName("sideDecorator 문자 추가 확인 및 유효 row 외 조회 테스트")
    void test2() {
        String test = "Decorator Pattern Test";
        SingleText singleText = new SingleText(test);
        SideDecorator sideDecorator = new SideDecorator(singleText, '~');

        assertThat(sideDecorator.getRowText(0)).isEqualTo('~' + test + '~');
        assertThat(sideDecorator.getRowText(1)).isEqualTo(null);
    }

    @Test
    @DisplayName("BoxDecorator 문자열 출력 테스트")
    void test3() {
        String test = "Decorator Pattern Test";
        SingleText singleText = new SingleText(test);
        SideDecorator sideDecorator = new SideDecorator(singleText, '~');
        BoxDecorator boxDecorator = new BoxDecorator(sideDecorator);

        ArrayList<String> expectList = new ArrayList<>();
        expectList.add('+' + "------------------------" + '+');
        expectList.add("|~" + test + "~|");
        expectList.add('+' + "------------------------" + '+');

        int rowCnt = boxDecorator.getRowsCount();

        for (int i = 0; i < rowCnt; i++) {
            assertThat(boxDecorator.getRowText(i)).isEqualTo(expectList.get(i));
        }
    }
}
