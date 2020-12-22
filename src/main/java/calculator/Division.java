package calculator;

public class Division extends Numbers {

    public Division(double firstNumber, double secondNumber) {
        super(firstNumber, secondNumber);
        theDev = theDevision(getFirstNumber(),getSecondNumber());
//        System.out.println("я внутри контруктора Division");
    }

    double theDev;

    public double theDevision (double firstNumber, double secondNumber) {
//        System.out.println("я старте " + getFirstNumber() + " " + getSecondNumber());
        double x = 0.0;
        try {
            x = firstNumber / secondNumber;
//            System.out.println("я внутри блока try " + x);
        } catch (ArithmeticException e) {
//            x = 9999999;
            System.out.println("УУУУУУуууууу, на ноль поделил?");
        }
//        System.out.println(x);
        return x;
    }

    @Override
    public String toString() {
        return String.valueOf(theDev);
    }
}