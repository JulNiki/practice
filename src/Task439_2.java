/*Пользователь вводит количество строк и столбцов двумерного массива, а затем начальное значение генератора случайных чисел.
Создать массив целых чисел указанной размерности и инициализировать его случайными числами от -10 до 10.
Массив вывести на консоль в виде таблицы, элементы которой отделяются знаками табуляции. Знак табуляции должен быть и  в конце каждой строки.
В каждой строке найти первый отрицательный элемент и вывести индекс соответствующего столбца или слово "NO", если он отсутствует.*/

import java.util.Random;
import java.util.Scanner;

class Task439_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[scanner.nextInt()][scanner.nextInt()];
        Random random = new Random(scanner.nextLong());
        int max = 0;
        int count = 0;
        scanner.close();
        boolean foundNeg = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(-10, 11);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            foundNeg = false;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 0){
                System.out.println(j);
                foundNeg = true;
                break;}
            }
            if (!foundNeg) {
                System.out.println("NO");
            }

        }

    }
}