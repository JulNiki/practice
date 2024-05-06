//Вывести исходный массив на консоль в одной строке, разделяя элементы пробелами. Пробел должен быть в том числе и после последнего элемента массива.
//Найти сумму положительных элементов массива и произведение отрицательных элементов. Произведение быстро растет, поэтому оно должно иметь тип double.
//C новой строки вывести результаты программы через пробел (сначала сумму, а потом произведение).

import java.util.Random;
import java.util.Scanner;

class Task322 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int[] mas = new int[len];
        int sumPositive = 0;
        double prodNegative = 1;
        long  seed = scan.nextLong(); //вводим начальное значение генератора
        Random rand = new Random(seed); //Создаем объект класса Random

        for(int i = 0; i < mas.length; i++){
            mas[i] = rand.nextInt(-5, 6); //числа от -5 до 5
            System.out.print(mas[i] + " ");
        }

        System.out.println();

        for (int ma : mas) {
            if (ma > 0) {
                sumPositive += ma;
            }
        }
        System.out.print(sumPositive + " ");

        for (int ma : mas) {
            if (ma < 0) {
                prodNegative *= ma;
            }
        }
        System.out.println(prodNegative);
    }


}