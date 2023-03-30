package singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.assertj.core.api.Assertions.assertThat;

class SynchronizedSingleTonTest {
    @Test
    @DisplayName("싱글턴 인스턴스 동일성 테스트")
    void getInstance_싱글턴_동일성_테스트() {
        SynchronizedSingleTon instance1 = SynchronizedSingleTon.getInstance();
        SynchronizedSingleTon instance2 = SynchronizedSingleTon.getInstance();

        assertThat(instance1).isEqualTo(instance2);
    }

    @Test
    @DisplayName("싱글턴 동시성 테스트")
    void 싱글턴_동시성_테스트() {
        SynchronizedSingleTon[] singleTonArray = new SynchronizedSingleTon[100];

        ExecutorService service = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++) {
            final int num = i;
            service.submit(() -> {
                singleTonArray[num] = SynchronizedSingleTon.getInstance();
            });
        }

        service.shutdown();

        for (SynchronizedSingleTon singleTon: singleTonArray) {
            assertThat(singleTon).isEqualTo(singleTonArray[0]);
        }
    }
}