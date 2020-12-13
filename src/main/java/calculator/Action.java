package calculator;

public class Action extends Numbers {
    String sign;
    public String result = "если видно эту надпись, значит переменная не изменялась'";

    public Action(double firstNumber, double secondNumber, String sign) {
        super(firstNumber, secondNumber);
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String pickAction (String sign) {
        switch (sign) {
            case "+":
                Sum result1 = new Sum(getFirstNumber(), getSecondNumber());
                return String.valueOf(result1);
            case "-":
                Subtraction result2 = new Subtraction(getFirstNumber(), getSecondNumber());
                return String.valueOf(result2);
            case "*":
                Multiplication result3 = new Multiplication(getFirstNumber(), getSecondNumber());
                return String.valueOf(result3);
            case "/":
                Division result4 = new Division(getFirstNumber(), getSecondNumber());
                return String.valueOf(result4);
            default:
                System.out.println("Что-то странное, начнем сначала");
        }

        return null;

    }

    public String toString() {
        return String.valueOf(result);
    }
}