//Напишите статический метод maxNumberDivider(), который в заданном диапазоне находит первое число с наибольшим количеством делителей.
import java.util.Scanner;

class Task320 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int max = maxNumberDivider(a, b);
        System.out.println(max);
    }



    public static int sumNumberDivider(int num) {
        int count =0;
        for (int i = 1;i <= num;i++) {
            if ( num % i == 0) {
                count++;  }
        }
        return count;
    }

    public static int maxNumberDivider (int a, int b) {
        int x1 = Math.min(a, b);
        int x2 = Math.max(a, b);
        int sum = 0;
        int maxNum = 0;
        for (int i = x1; i<=x2; i++){
            if (sumNumberDivider(i) > sum){
                sum = sumNumberDivider(i);
                maxNum = i;
            }
        }
        return maxNum;
    }
}