/*Пользователь вводит размер массива и начальное значение генератора случайных чисел.
Создать массив  целых чисел заданного размера и заполнить его случайными числами от 10 до 20 (включительно). Распечатать исходный массив, используя метод toString() - в квадратных скобках, элементы через запятую.
Затем вводятся два индекса (индексы в тестах корректные). Отсортировать по возрастанию часть массива между двумя этими индексами (включая оба).
С новой строки вывести преобразованный массив на консоль методом toString().*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Task425 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int [] mas = new int [len];
        long  seed = scan.nextLong(); //вводим начальное значение генератора
        Random rand = new Random(seed); //Создаем объект класса Random

        for(int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(10, 21); //числа от 10 до 21
        }

        System.out.println(Arrays.toString(mas));
        int ind1 = scan.nextInt();
        int ind2 = scan.nextInt();
        scan.close();
        Arrays.sort(mas, ind1,ind2+1);
        System.out.println(Arrays.toString(mas));

    }
}