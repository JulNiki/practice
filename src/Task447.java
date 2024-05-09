/* три статических метода для работы с двумерным массивом:
1) initArray() - инициализирует двумерный массив случайными числами от 0 до 10;
2) printArray() - выводит двумерный массив на консоль в виде таблицы (элементы строках отделяются знаками табуляции, и знак табуляции должен быть в конце каждой строки)
3)  printMaxIndex() - для каждой строки двумерного массива выводит индекс столбца первого максимального элемента. Элементы отделяются пробелами.
В методе main() вводятся три целых числа: количество строк и количество столбцов массива, а затем начальное значение генератора случайных чисел.
Двумерный массив создается и выводится, а затем выводятся индексы максимальных элементов. Код метода main() менять нельзя!
P.S. Желательно при реализации метода printMaxIndex() использовать вызов метода findMax(), который был написан на предыдущем шаге.*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task447 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ar = new int[scan.nextInt()];
        long seed = scan.nextLong();
        init(ar, seed);
        print(ar);
        int[] b = reduceAfterMax(ar);
        print(b);
    }
    public static void init(int[] mas,long seed){
        Random rand = new Random(seed);
        for(int i = 0; i < mas.length; i++){
            mas[i] = rand.nextInt(-3,6);
        }
    }
    public static void print(int[] mas) {
        for(int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + " ");
        }
        System.out.println();
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

    public static int[] reduceAfterMax(int[] mas) {
        int indMax = findMax(mas);
        int [] mas2 = Arrays.copyOfRange(mas, 0, indMax+1);
        return mas2;}
}