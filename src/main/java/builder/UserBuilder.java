package builder;

public class UserBuilder {
    private Long id;
    private String email;
    private String nickName;
    private String password;
    private int age;
    private int score;

    public UserBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public UserBuilder email(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder nickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    public UserBuilder password(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder age(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder score(int score) {
        this.score = score;
        return this;
    }

    public User build() {
        return new User(id, email, nickName, password, age, score);
    }
}
