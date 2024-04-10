import java.util.Scanner;
class MySolif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((a + b) % 2 == 0) {
            if ((a * b) % 2 == 1) {
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