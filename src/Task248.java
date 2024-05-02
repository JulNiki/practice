/* Пользователь вводит два целых числа (границы отрезка числовой оси).
Границы могут быть введены некорректно (первое число больше второго).
В этом случае нужно границы переставить местами. Т.е. перебор должен быть всегда от меньшего к большему.
 */
import java.util.Scanner;

public class Task248 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int x1 = Math.min(x, y);
        int x2 = Math.max(x, y);
        int sum = 0;
        int sumMax = 0;
        int number = 0;

        for (int i = x1; i <= x2; i++) {
            for(int n = i; n != 0; n /= 10)
            {
                sum += Math.abs(n % 10);
            }
            if (sum > sumMax) {
                sumMax = sum;
                number = i;
            }
            sum = 0;
        }
        System.out.println(number);
    }
}