package adapter;

public class Airplane {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String flyable() {
        return  "flyable";
    }
}
