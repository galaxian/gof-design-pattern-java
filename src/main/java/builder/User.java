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
}
