//Напишите статический метод simpleInRange(),
// который подсчитывает количество простых чисел в заданном диапазоне.
// Если границы диапазона введены неверно (первое число больше второго), то в методе нужно их переставить местами.

import java.util.Scanner;

class Task318 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int kol = simpleInRange(a, b);
        System.out.println(kol);
    }

    public static boolean isSimple (int num) {
        int count = 0;
        for (int i = 1;i <= num;i++) {
            if ( num % i == 0) {
                count++;
                if (count > 2) {
                    break;}
            }
        }
        return count == 2;
    }

    public static int simpleInRange (int a, int b) {
        int x1 = Math.min(a, b);
        int x2 = Math.max(a, b);
        int count =0;
        for (int i = x1; i <= x2; i++) {
            if (isSimple(i)) {
                count++;
            }
        }
        return count;
    }
}