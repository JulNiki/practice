//Массив из вещественных чисел типа double заполнить случайными значениями от 0 до 5 (не включая). Пользователь вводит размер массива, а затем начальное значение генератора случайных чисел.
//Вывести исходный массив на консоль в одной строке, разделяя элементы пробелами. Пробел должен быть в том числе и после последнего элемента массива.
//Найти среднее арифметическое элементов массива и вывести его с новой строки. Заменить все элементы, большие среднего, его значением.
//C новой строки вывести преобразованный массив. Элементы отделяются пробелами.
//Все вещественные числа при выводе округляются до двух знаков после десятичной точки.

import java.util.Random;
import java.util.Scanner;

class Task323 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        double [] mas = new double [len];
        long  seed = scan.nextLong(); //вводим начальное значение генератора
        Random rand = new Random(seed); //Создаем объект класса Random
        double sumMas = 0;
        double arithmetic;

        for(int i = 0; i < mas.length; i++){
            mas[i] = rand.nextDouble(0, 5); //числа от 1 до 4
            System.out.printf("%.2f ", mas[i]);
        }

        System.out.println();

        for(int i=0; i < mas.length;i++){
            sumMas+=mas[i];
        }
        arithmetic = sumMas/len;
        System.out.printf("%.2f%n", arithmetic);

        for(int i=0; i < mas.length;i++){
            if(mas[i] > arithmetic){
                mas[i]=arithmetic;
            }
        }

        for(int i = 0; i < mas.length; i++){
            System.out.printf("%.2f ", mas[i]);
        }
        System.out.println();

    }
}