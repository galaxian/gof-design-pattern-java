package builder;

public class User {
    private Long id;
    private String email;
    private String nickName;
    private String password;
    private int age;
    private int score;

    public User(Long id, String email, String nickName, String password, int age, int score) {
        this.id = id;
        this.email = email;
        this.nickName = nickName;
        this.password = password;
        this.age = age;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getNickName() {
        return nickName;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }
}
