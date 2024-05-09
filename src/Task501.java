/*  Введите три строки (могут содержать пробелы). Выведите их в порядке возрастания.*/

import java.util.Arrays;
import java.util.Scanner;

public class Task501 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        String s3 = scan.nextLine();

        String[] array = new String[]{s1, s2, s3};
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}