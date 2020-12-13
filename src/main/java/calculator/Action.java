package calculator;

public class Action extends Numbers{
    String sign;
    private String result = "если видно эту надпись, значит переменная не изменялась'";

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
        switch (sign)    {
            case "+":
                Sum result = new Sum(getFirstNumber(),getSecondNumber());
                break;
            case "-":
                Subtraction result2 = new Subtraction(getFirstNumber(),getSecondNumber());
                break;
            case "*":
                Multiplication result3 = new Multiplication(getFirstNumber(),getSecondNumber());
                break;
            case "/":
                Division result4 = new Division(getFirstNumber(),getSecondNumber());
                break;
            default:
            System.out.println("Что-то странное, начнем сначала");
    }
    return result;
    }
    public String toString() {
        return String.valueOf(result);
    }
}