package bridge;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new CalculateImp());
        calculator.printAllCalculate(3, 4);
    }
}
