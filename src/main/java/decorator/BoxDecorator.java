package decorator;

public class BoxDecorator extends Decorator {
    public BoxDecorator(Item item) {
        super(item);
    }

    @Override
    public int getRowsCount() {
        return item.getRowsCount() + 2;
    }

    @Override
    public int getColumnsCount() {
        return item.getColumnsCount() + 2;
    }

    @Override
    public int maxLength() {
        return getRowsCount() * getColumnsCount();
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == item.getRowsCount() + 1) {
            return "+" + makeLine('-', item.getColumnsCount()) + "+";
        } else {
            return "|" + item.getRowText(row - 1) + "|";
        }
    }

    private String makeLine(char ch, int cnt) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < Math.max(0, cnt); i++) {
            temp.append(ch);
        }
        return temp.toString();
    }
}
