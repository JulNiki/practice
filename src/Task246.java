/* Пользователь вводит ширину треугольника. Нарисовать треугольник из звездочек, как показано в примерах теста.
Если вводятся некорректные данные (ширина  <= 0), то вывести "ERROR".*/
import java.util.Scanner;

class Task246 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        sc.close();
        int i = 0;
        if (h <= 0) {
            System.out.println("ERROR");
            return;
        }
        while (h-2*i >= 0) {
            System.out.print(" ".repeat(i));
            System.out.println("*".repeat(h-2*i));
            i++;
        }
    }
}