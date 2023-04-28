package decorator;

public class SingleText extends Item{
    private final String string;

    public SingleText(String string) {
        this.string = string;
    }


    @Override
    public int getRowsCount() {
        return 1;
    }

    @Override
    public int getColumnsCount() {
        return string.length();
    }

    @Override
    public int maxLength() {
        return getRowsCount()*getColumnsCount();
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return string;
        }
        return null;
    }
}
