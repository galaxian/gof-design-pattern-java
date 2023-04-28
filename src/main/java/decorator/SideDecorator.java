package decorator;

public class SideDecorator extends Decorator{
    private final char sideChar;

    public SideDecorator(Item item, char sideChar) {
        super(item);
        this.sideChar = sideChar;
    }

    @Override
    public int getRowsCount() {
        return item.getRowsCount();
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
        if (item.getRowText(row) == null) {
            return null;
        }
        return sideChar + item.getRowText(row) + sideChar;
    }
}
