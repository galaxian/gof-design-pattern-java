package singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SingleTonTest {

    @Test
    @DisplayName("싱글턴 인스턴스 동일성 테스트")
    void getInstance_싱글턴_동일성_테스트() {
        SingleTon singleTon1 = SingleTon.getInstance();
        SingleTon singleTon2 = SingleTon.getInstance();

        assertThat(singleTon1).isEqualTo(singleTon2);
    }
}