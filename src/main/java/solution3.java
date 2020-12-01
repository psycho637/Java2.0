import java.util.Scanner;

public class solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите задание: 1 - калькулятор, 2 - поиск в массиве");
        int aa = scanner.nextInt();
        switch (aa) {
            case 1:
                System.out.println("ВВедите 1 число: ");
                float a = scanner.nextFloat();
                System.out.println("ВВедите 2 число: ");
                float b = scanner.nextFloat();
                System.out.println("Выберите операцию: +, -, *, / ");
                var c = scanner.next();

                switch (c) {
                    case "+":
                        System.out.print(a + " + " + b + " = ");
                        System.out.printf("%.4f", a + b);
                        break;
                    case "-":
                        System.out.print(a + " - " + b + " = ");
                        System.out.printf("%.4f", a - b);
                        break;
                    case "*":
                        System.out.print(a + " * " + b + " = ");
                        System.out.printf("%.4f", a * b);
                        break;
                    case "/":
                        System.out.print(a + " / " + b + " = ");
                        System.out.printf("%.4f", a / b);
                        break;
                    default:
                        System.out.println("Что-то странное, начнем сначала");
                        break;
                }
            case 2:
                System.out.println("Сколько элементов в массиве?");
                int n = scanner.nextInt();
                String[] array = new String[n];
                scanner.nextLine();
                for (int j = 0; j < n; j++) {
                    System.out.print("Элемент " + (j+1) + " равен ");
                    array[j] = scanner.nextLine();
                }
                int l = 0;
                int k = array[0].length();
                for (int j = 1; j < n; j++) {
                    if (k < array[j].length()) {
                        l = j;
                    }
                }
                System.out.println(array[l]);

                break;
            default:
                System.out.println("Нет такого задания");
        }
    }
}