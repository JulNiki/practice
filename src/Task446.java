/* три статических метода для работы с двумерным массивом:
1) initArray() - инициализирует двумерный массив случайными числами от 0 до 10;
2) printArray() - выводит двумерный массив на консоль в виде таблицы (элементы строках отделяются знаками табуляции, и знак табуляции должен быть в конце каждой строки)
3)  printMaxIndex() - для каждой строки двумерного массива выводит индекс столбца первого максимального элемента. Элементы отделяются пробелами.
В методе main() вводятся три целых числа: количество строк и количество столбцов массива, а затем начальное значение генератора случайных чисел.
Двумерный массив создается и выводится, а затем выводятся индексы максимальных элементов. Код метода main() менять нельзя!
P.S. Желательно при реализации метода printMaxIndex() использовать вызов метода findMax(), который был написан на предыдущем шаге.*/

import java.util.Random;
import java.util.Scanner;

public class Task446 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] mas = new int[scan.nextInt()][scan.nextInt()];
        long seed = scan.nextLong();
        initArray(mas, seed);
        printArray(mas);
        System.out.println();
        printMaxIndex(mas);
    }
    public static void initArray(int[][] mas,long seed) {
        Random rand = new Random(seed);
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(11);
            }
        }
    }

    public static void printArray(int[][]mas) {
            for(int i = 0; i < mas.length; i++){
                for (int j = 0; j < mas[i].length; j++){
                    System.out.print(mas[i][j] + " ");
                }
                System.out.println();
            }
    }

    public static int findMax(int[] mas) {
        int max = mas[0];
        int ind = 0;
        for(int i = 0; i < mas.length; i++){
            if (max < mas[i]){
                max = mas[i];
                ind = i;
            }
        }
        return ind;
    }

    public static void printMaxIndex(int[][]mas) {
        for(int i = 0; i < mas.length; i++){
            System.out.print(findMax(mas[i])+ " ");
        }
    }
}