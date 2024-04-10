import java.util.Scanner;

public class Mynumerot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a % 2 != 0 && b % 2 != 0 && c % 2 != 0) {
            System.out.println("Чётных чисел нет");
        }
        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
            System.out.println(Math.max(Math.max(a, b), c));
        }
        if (a % 2 != 0 && b % 2 == 0 && c % 2 == 0) {
            System.out.println(Math.max(b, c));
        }
        if (a % 2 == 0 && b % 2 != 0 && c % 2 == 0) {
            System.out.println(Math.max(a, c));
        }
        if (a % 2 == 0 && b % 2 == 0 && c % 2 != 0) {
            System.out.println(Math.max(a, b));
        }
        if (a % 2 == 0 && b % 2 != 0 && c % 2 != 0) {
            System.out.println(a);
        }
        if (a % 2 != 0 && b % 2 == 0 && c % 2 != 0) {
            System.out.println(b);
        }
        if (a % 2 != 0 && b % 2 != 0 && c % 2 == 0) {
            System.out.println(c);
        }

    }
}