import java.util.Scanner;

class MySol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a > 0) && (a < 32) && (c > 0) && (b > 0) && (b < 13)) {
            if ((b == 1) ^ (b == 3) ^ (b == 5) ^ (b == 7) ^ (b == 8) ^ (b == 10) ^ (b == 12) && (a < 32) && (c > 0)) {
                System.out.println("true");
            } else if ((b == 4) ^ (b == 6) ^ (b == 9) ^ (b == 11) && (a < 31)) {
                System.out.println("true");
            } else if ((b == 2) && (a < 30) && ((c % 4 == 0) && (c % 100 != 0) || (c % 100 == 0 && c % 400 == 0))) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}