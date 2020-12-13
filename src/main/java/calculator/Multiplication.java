package calculator;

public class Multiplication extends Numbers {

    public Multiplication(double firstNumber, double secondNumber) {
        super(firstNumber, secondNumber);
    }
    double theMult = getFirstNumber() * getSecondNumber();

    @Override
    public String toString() {
        return String.valueOf(theMult);
    }
}
