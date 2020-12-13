package calculator;

public class Subtraction extends Numbers {
    public Subtraction(double firstNumber, double secondNumber) {
        super(firstNumber, secondNumber);
    }
    double theSub = getFirstNumber() - getSecondNumber();

    @Override
    public String toString() {
        return String.valueOf(theSub);
    }
}
