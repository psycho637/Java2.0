package calculator;

import static jdk.nashorn.internal.objects.Global.Infinity;

public class Division extends Numbers {

    public Division(double firstNumber, double secondNumber) {
        super(firstNumber, secondNumber);
        theDev = theDevision(getFirstNumber(), getSecondNumber());
    }

    String theDev;

    public String theDevision(double firstNumber, double secondNumber) {
        double x = firstNumber / secondNumber;
        if (x == Infinity) {
            return "УУУУУУуууууу, на ноль поделил?";
        }
        return String.valueOf(x);
    }

    @Override
    public String toString() {
        return String.valueOf(theDev);
    }
}