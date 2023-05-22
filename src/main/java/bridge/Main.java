package bridge;

public class Main {
    public static void main(String[] args) {
        Calculator quotientCalculator = new Calculator(new QuotientCalculate());
        quotientCalculator.printAllCalculate(3, 4);

        Calculator remainderCalculator = new Calculator(new RemainderCalculate());
        remainderCalculator.printAllCalculate(3,4);
    }
}
