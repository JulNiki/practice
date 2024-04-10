import java.util.Scanner;
class Mynum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = (a % 2) + (b % 2) + (c % 2);
        if (sum == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}