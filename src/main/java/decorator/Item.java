package decorator;

public abstract class Item {
    public abstract int getRowsCount();
    public abstract int getColumnsCount();
    public abstract int maxLength();
    public abstract String getRowText(int row);

    public void print() {
        for (int i = 0; i < getRowsCount(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
