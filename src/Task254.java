/* Выведите все простые числа в заданном диапазоне (включая его границы).
Границы диапазона вводит пользователь через пробел (положительные целые числа). Границы диапазона в тестах корректны (не нужно проверять, что первая граница меньше или равна второй).
Если в заданном диапазоне нет простых чисел, то не должно быть выведено ничего (пустой результат) */
import java.util.Scanner;

public class Task254 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int x2 = scan.nextInt();

        for (int i = x1; i <= x2; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        scan.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int k = 2; k * k <= number; k++) {
            if (number % k == 0) {
                return false;
            }
        }
        return true;
    }
}