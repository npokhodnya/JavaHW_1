import java.util.Scanner;

public class Task1 {
    public static int triangleNum(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) res += i;
        return res;
    }

    public static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) res *= i;
        return res;
    }

    public static void main(String[] args) {
        // Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n).
        var scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.printf("Факториал - %d\n", factorial(num));
        System.out.printf("Треугольное число - %d", triangleNum(num));
    }
}