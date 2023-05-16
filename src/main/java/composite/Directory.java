package composite;

import java.util.ArrayList;

public class Directory implements Node{

    private String name;
    private ArrayList<Node> list = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(Node node) {
        list.add(node);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int sum = 0;
        for(Node node: list) {
            sum += node.getSize();
        }
        return sum;
    }

    @Override
    public void print() {
    }
}
