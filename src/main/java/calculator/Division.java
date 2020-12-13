package calculator;

public class Division extends Numbers {
    public Division(double firstNumber, double secondNumber) {
        super(firstNumber, secondNumber);
    }
    double theDev = getFirstNumber() / getSecondNumber();

    @Override
    public String toString() {
        return String.valueOf(theDev);
    }
}
