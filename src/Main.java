//Пользователь вводит границы диапазона положительных целых чисел. Границы диапазона в тестах корректны (не нужно проверять, что первая граница меньше или равна второй).
//Нужно найти сумму наименьших делителей всех чисел в этом диапазоне (рассматриваются делители, начиная с 2).

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int x2 = scan.nextInt();
        int sum = 0;
        scan.close();



        ONE: for (int i = x1; i <= x2; i++) {
            for (int k = 2; k <= i; k++) {
                if (i % k == 0) {
                    sum += k;
                    continue ONE;
                }

            }
        }
        System.out.println(sum);
    }
}