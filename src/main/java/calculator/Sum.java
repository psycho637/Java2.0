package calculator;

public class Sum extends Numbers {


    public Sum(double firstNumber, double secondNumber) {
        super(firstNumber, secondNumber);
    }

   double theSum = getFirstNumber() + getSecondNumber();

    public String toString() {
        return String.valueOf(theSum);
    }
}