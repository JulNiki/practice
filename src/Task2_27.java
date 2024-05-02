import java.util.Scanner;

public class Task2_27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        int min = scan.nextInt();
        for (int i = 0; i < (amount - 1); i++) {
            int num = scan.nextInt();
            min = (num < min) ? num : min;
        }
        scan.close();
        System.out.println(min);
    }
}