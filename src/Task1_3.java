import java.util.Arrays;
import java.util.Scanner;

public class Task1_3 {
    public static boolean isOperation(String operation) {
        String[] operations = {"+", "-", "/", "*"};
        return Arrays.asList(operations).contains(operation);
    }

    public static String calculate(int a, int b, String operation) {
        if (isOperation(operation)) {
            switch (operation) {
                case ("+") -> {
                    return Integer.toString(a + b);
                }
                case ("-") -> {
                    return Integer.toString(a - b);
                }
                case ("*") -> {
                    return Integer.toString(a * b);
                }
                case ("/") -> {
                    return Integer.toString(a / b);
                }
            }
        }
        return "Ошибка!";
    }

    public static void main(String[] args) {
        // Создать простейший калькулятор
        var scan = new Scanner(System.in);
        System.out.print("Первое число: ");
        int numa = scan.nextInt();
        System.out.print("Второе число: ");
        int numb = scan.nextInt();
        System.out.print("Операция (+, -, /, *): ");
        var operation = scan.next();
        System.out.printf("Ответ: %s", calculate(numa, numb, operation));
    }
}
