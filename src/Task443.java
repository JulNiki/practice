/* три статических метода  для работы с одномерным массивом целых чисел:
1) init()  - заполнение массива случайными числами от -3 до 5;
2) print() - вывод массива на консоль в строку, отделяя элементы пробелами;
3) findMax() - поиск индекса первого максимального элемента в одномерном массиве.
Пользователь вводит количество элементов одномерного массива и начальное значение генератора случайных чисел.
Выводится на консоль сформированный массив, и затем с новой строки - найденный индекс первого максимального элемента  в массиве.*/

import java.util.Random;
import java.util.Scanner;

public class Task443 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ar = new int[scan.nextInt()];
        long seed = scan.nextLong();
        init(ar,seed);
        print(ar);
        int ind = findMax(ar);
        System.out.println(ind);
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
}