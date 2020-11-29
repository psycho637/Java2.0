/**
 * @author Dmitry Povetkin
 * @see arithmetic second grade
 * @see <a href=url>http://sovschool.com/web/index.php?r=site%2Fbook&id=242</a>
 */

import java.util.Scanner;

public class solution2 {
    public static void main(String[] args) {
        float result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите 1 число: ");
        float a = scanner.nextFloat();
        System.out.println("ВВедите 2 число: ");
        float b = scanner.nextFloat();
        System.out.println("Выберите операцию: +, -, *, / ");
        var c = scanner.next();

        // Выбираем правильное действие
        switch (c) {
            case "+": // сложение
                System.out.print(a + " + " + b + " = ");
                System.out.printf("%.4f", a + b);
                break;
            case "-": // вычитание
                System.out.print(a + " - " + b + " = ");
                System.out.printf("%.4f", a - b);
                break;
            case "*": // умножение
                System.out.print(a + " * " + b + " = ");
                System.out.printf("%.4f", a * b);
                break;
            case "/": // деление
                System.out.print(a + " / " + b + " = ");
                System.out.printf("%.4f", a / b);
                break;
            default: // что-то
                System.out.println("Что-то странное, начнем сначала");
        }
    }
}