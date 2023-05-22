package bridge;

public class Calculator {
    protected Calculate calculate;

    public Calculator(Calculate calculate) {
        this.calculate = calculate;
    }

    public int add(int a, int b) {
        return calculate.add(a, b);
    }

    public int sub(int a, int b) {
        return calculate.sub(a, b);
    }

    public int mul(int a, int b) {
        return calculate.mul(a, b);
    }

    public int div(int a, int b) {
        return calculate.div(a, b);
    }

    public void printAllCalculate(int a, int b) {
        System.out.println("-----------------");
        System.out.println(a + " + " + b + " = " + add(a, b));
        System.out.println(a + " - " + b + " = " + sub(a, b));
        System.out.println(a + " * " + b + " = " + mul(a, b));
        System.out.println(a + " / " + b + " = " + div(a, b));
        System.out.println("-----------------");
    }
}
