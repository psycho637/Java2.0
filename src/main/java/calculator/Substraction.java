package calculator;

public class Substraction extends Numbers {
    public Substraction(double firstNumber, double secondNumber) {
        super(firstNumber, secondNumber);
    }
    double theSub = getFirstNumber() - getSecondNumber();

    @Override
    public String toString() {
        return String.valueOf(theSub);
    }
}
