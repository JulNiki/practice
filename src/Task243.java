/*Пользователь вводит ширину треугольника (от 1 до 9). Изобразить треугольник числами */
import java.util.Scanner;
public class Task243 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        for(int i = height;i > 0; i--) { //меняется i - номер строки
            for(int j = 1; j <= i; j++) { //меняется j - номер столбца
                System.out.print(i);
            }
            System.out.println();
        }
    }
}