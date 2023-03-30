package builder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserBuilderTest {
    @Test
    @DisplayName("빌더로 객체 생성시 인스턴스 확인 테스트")
    void 인스턴스_타입_확인() {
        User user1 = new UserBuilder()
                .id(1L)
                .email("abcd@gmail.com")
                .nickName("builder")
                .password("1234")
                .age(20)
                .score(80)
                .build();

        assertThat(user1).isInstanceOf(User.class);
    }
}