package decorator;

public class Main {
    public static void main(String[] args) {
        SingleText text = new SingleText("gof design pattern");
        SideDecorator sideDecorator = new SideDecorator(text, '!');
        BoxDecorator boxDecorator = new BoxDecorator(sideDecorator);

        text.print();
        sideDecorator.print();
        boxDecorator.print();
    }
}
