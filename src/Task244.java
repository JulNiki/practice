/* Пользователь вводит  высоту  и ширину рамки через пробел. Нарисовать рамку из звездочек.
  Если вводятся некорректные данные (высота или ширина <= 0), то вывести "ERROR".*/
import java.util.Scanner;

class Task244 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height  = sc.nextInt();
        int width = sc.nextInt();

        if (height <= 0 || width <= 0) {
            System.out.println("ERROR");
            return;
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j ++) {
                if (i == 0 || i == (height-1) || j == 0 || j == (width-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
                System.out.println();
        }
    }
}