/*  Пользователь вводит три строки, которые содержат части кодового слова. Каждая вводимая строка может содержать пробелы и заканчивается символом перехода на новую строку ('\n').
Части кодового слова выделены внутри строки знаками ';'. Нужно соединить эти части в одну строку и вывести эту строку на консоль.  */
import java.util.Scanner;

public class Task503 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder codeWord = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            String inputLine = scan.nextLine();
            String[] parts = inputLine.split(";");
            codeWord.append(parts[1]);
        }

        System.out.println(codeWord.toString());
        scan.close();
    }
}