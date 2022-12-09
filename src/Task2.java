import java.util.Scanner;

public class Task2 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        else if (n == 2) return true;
        else {
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        // Вывести все простые числа от 1 до 1000 (до n)
        var scan = new Scanner(System.in);
        System.out.print("До какого числа: ");
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            if (isPrime(i)) System.out.printf("%d ", i);
        }
    }
}
