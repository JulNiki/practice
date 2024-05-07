/*Пользователь вводит размер массива и начальное значение генератора случайных чисел.
Создать массив  чисел типа double заданного размера и заполнить его случайными числами от 0 до 2.
 Распечатать исходный массив, используя метод toString() - в квадратных скобках, элементы через запятую.
С новой строки вывести на консоль сумму максимального и минимального элементов массива.*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Task424 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        double [] mas = new double [len];
        long  seed = scan.nextLong(); //вводим начальное значение генератора
        Random rand = new Random(seed); //Создаем объект класса Random

        for(int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextDouble(0, 2); //числа от 0 до 2
        }

        System.out.println(Arrays.toString(mas));

        Arrays.sort(mas);

        System.out.println(mas[0] + mas[len-1]);

    }
}