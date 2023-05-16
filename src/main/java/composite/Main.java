package composite;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");

        File file1 = new File("file1", 10);
        Directory directory1 = new Directory("dir1");
        Directory directory2 = new Directory("dir2");

        root.add(file1);
        root.add(directory1);
        root.add(directory2);

        File file12 = new File("file12", 10000);
        File file21 = new File("file21", 39243);

        directory1.add(file12);
        directory2.add(file21);

        root.print();
    }
}
