import java.util.Scanner;

public class Task256 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        scan.close();
        outputSumOfEvenDivisors(x);
    }

    public static void outputSumOfEvenDivisors(int number) {
        int sum = 0;
        for (int i = 2; i < number; i+=2) {
            if (number % 2 != 0) {
                break;}

            if (number % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}