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

    @Test
    @DisplayName("빌더로 객체 생성시 각 변수의 값이 올바르게 들어가는지 확인")
    void 변수_값_테스트() {
        Long id = 1L;
        String email = "abcd@gmail.com";
        String nickName = "builder";
        String password = "1234";
        int age = 20;
        int score = 80;

        User user2 = new UserBuilder()
                .id(id)
                .email(email)
                .nickName(nickName)
                .password(password)
                .age(age)
                .score(score)
                .build();

        assertThat(user2.getId()).isEqualTo(id);
        assertThat(user2.getNickName()).isEqualTo(nickName);
        assertThat(user2.getEmail()).isEqualTo(email);
        assertThat(user2.getPassword()).isEqualTo(password);
        assertThat(user2.getAge()).isEqualTo(age);
        assertThat(user2.getScore()).isEqualTo(score);
    }

    @Test
    @DisplayName("변수 미할당 시 초기화 확인")
    void 변수_초기화_테스트() {
        User user3 = new UserBuilder()
                .id(1L)
                .build();

        assertThat(user3.getEmail()).isNull();
        assertThat(user3.getScore()).isEqualTo(0);
    }
}