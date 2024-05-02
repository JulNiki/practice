/*Пользователь вводит высоту треугольника. Нарисовать треугольник из звездочек.*/
import java.util.Scanner;

class Task245 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();

        if (h <= 0) {
            System.out.println("ERROR");
            return;
        }
        for (int i = 1; i <= h; i++) {
            for (int k = 1; k <= h; k++) {
                if (i > 1 && k < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}