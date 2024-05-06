//Массив из целых чисел заполнить случайными значениями от -5 до 15 (включая обе границы) Пользователь вводит размер массива, а затем начальное значение генератора случайных чисел.
//Вывести исходный массив на консоль в одной строке, разделяя элементы пробелами. Пробел должен быть в том числе и после последнего элемента массива.
//Поменять местами первый максимальный и последний отрицательный элементы. Если отрицательных элементов нет в массиве, то он должен остаться без изменения.
//C новой строки вывести измененный массив, отделяя элементы пробелами.

import java.util.Random;
import java.util.Scanner;

class Task415 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int [] mas = new int [len];
        long  seed = scan.nextLong(); //вводим начальное значение генератора
        Random rand = new Random(seed); //Создаем объект класса Random
        int imax = 0;
        int ineg = 0;
        int temp = 0;

        for(int i = 0; i < mas.length; i++){
            mas[i] = rand.nextInt(-5, 16); //числа от -5 до 15
            System.out.print(mas[i] + " ");
        }

        System.out.println();


        for(int i=1; i < mas.length;i++){
            if(mas[i] > mas[imax]){
                imax=i;}

            if(mas[i] < 0){
                ineg=i;
            }
        }

        temp = mas[imax];
        mas[imax] = mas[ineg];
        mas[ineg] = temp;

        for(int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + " ");
        }

    }
}