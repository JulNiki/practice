/*  Пользователь вводит три строки, которые содержат части кодового слова. Каждая вводимая строка может содержать пробелы и заканчивается символом перехода на новую строку ('\n').
Части кодового слова выделены внутри строки знаками ';'. Нужно соединить эти части в одну строку и вывести эту строку на консоль.  */
import java.util.Scanner;

public class Task502 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        String s3 = scan.nextLine();

        String[]part1 = s1.split(";");
        String[]part2 = s2.split(";");
        String[]part3 = s3.split(";");
        String word = part1[1] + part2[1]+ part3[1];
        System.out.println(word);
    }
}