//Напишите статический  метод printDivider(), который выводит все делители натурального числа через пробел
// (включая единицу и само число). Метод не возвращает никакого значения!



import java.util.Scanner;

class Task319 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        printDivider(number);
    }

    public static void printDivider (int num) {
        for (int i = 1;i <= num;i++) {
            if ( num % i == 0) {
                System.out.print(i + " ");
            }
        }

    }
}