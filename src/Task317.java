//Напишите статический метод isSimple(), который возвращает true, если аргумент является простым числом, и false - в противном случае.
//Простым называется целое положительное число, которое не имеет других делителей, кроме единицы и себя самого.
//Отрицательные числа не могут быть простыми (поэтому функция должна возвращать false). Простыми также не являются числа 0 и 1.

import java.util.Scanner;

class Task317 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int number = scan.nextInt();
            System.out.print(isSimple(number) + " ");
        }
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
}