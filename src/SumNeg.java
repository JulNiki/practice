
import java.util.Scanner;

public class SumNeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Math.abs(scanner.nextInt());
        scanner.close();

        if (x < 100 || x > 999) {
            System.out.println("ERROR");
            return;
        }

        int x1 = x % 10;
        int x2 = x / 10 % 10;
        int x3 = x / 100;
        int sum = 0;

        // Суммируем нечетные цифры
        sum += (x1 % 2 != 0) ? x1 : 0;
        sum += (x2 % 2 != 0) ? x2 : 0;
        sum += (x3 % 2 != 0) ? x3 : 0;

        // Выводим результат
        System.out.println(sum == 0 ? "NO" : sum);
    }
}