/*Пользователь вводит количество строк и столбцов двумерного массива, а затем начальное значение генератора случайных чисел.
Создать целочисленный массив указанной размерности и инициализировать его случайными числами от -5 до 4. Массив вывести на консоль в виде таблицы, элементы которой отделяются знаками табуляции. Знак табуляции должен быть и  в конце каждой строки.
Найти максимальный элемент и подсчитать, сколько раз он встречается в массиве. Вывести максимальный элемент и найденное количество с  новой строки через пробел..*/

import java.util.Random;
import java.util.Scanner;

class Task438 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[scanner.nextInt()][scanner.nextInt()];
        Random random = new Random(scanner.nextLong());
        int max = 0;
        int count = 0;
        scanner.close();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(-5, 5);
                System.out.print(arr[i][j] + "\t");
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ( arr[i][j]==max){
                    count++;
                }
            }
        }
        System.out.println(max + " " + count);
    }
}