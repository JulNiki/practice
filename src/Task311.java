/*В методе main() класса Main введите начальное значение генератора псевдослучайных чисел. Затем разыграйте случайное число от -10 до 10 (напоминаю,
что для этого можно использовать класс Random). Создайте массив соответствующего размера и заполните его последовательными десятичными цифрами, начиная с нуля.
Выведите массив на консоль, используя метод Arrays.toString().Если разыгранное число отрицательное, то должно быть выведено сообщение
"Неверный размер массива: " и полученное значение. Используйте механизм обработки исключений!*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task311 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long seed = sc.nextLong();
        Random rand = new Random(seed);
        int randNom = rand.nextInt(-10,11);
        int[] arr = null;

        try {
            arr = new int[randNom];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i;
            }
        } catch (Exception e) {
            System.out.println("Неверный размер массива: " + randNom);
            return;
        }

        System.out.println(Arrays.toString(arr));

    }
}
