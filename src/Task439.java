/*Пользователь вводит количество строк и столбцов двумерного массива, а затем начальное значение генератора случайных чисел.
Создать массив целых чисел указанной размерности и инициализировать его случайными числами от -10 до 10.
Массив вывести на консоль в виде таблицы, элементы которой отделяются знаками табуляции. Знак табуляции должен быть и  в конце каждой строки.
Вывести пустую строку после двумерного массива.
Для каждого столбца найти сумму положительных элементов и вывести на консоль, отделяя пробелами.*/

import java.util.Random;
import java.util.Scanner;

class Task439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[scanner.nextInt()][scanner.nextInt()];
        Random random = new Random(scanner.nextLong());
        int max = 0;
        int count = 0;
        scanner.close();
        int sumPositiveCol = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(-10, 11);
                System.out.print(arr[i][j] + "\t");
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int j = 0; j < arr[0].length; j++ ) {
            sumPositiveCol=0;
            for (int i = 0; i < arr.length; i++) {
                if ( arr[i][j]>0){
                    sumPositiveCol+=arr[i][j];
                }

            }
            System.out.print(sumPositiveCol + " ");
        }
    }
}