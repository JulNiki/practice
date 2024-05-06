//Пользователь вводит размер массива и начальное значение генератора случайных чисел. Затем он вводит контрольный элемент (целое число).
//Создать массив заданного размера и заполнить его случайными числами от 2 до 15. Отсортировать массив по возрастанию. Распечатать отсортированный массив, используя метод toString() - в квадратных скобках, элементы через запятую.
//Найти в отсортированном массиве индекс контрольного элемента и удалить все элементы после него (создать новый массив нужного размера).
//Если контрольный элемент отсутствовал в массиве, то вывести "ERROR". В противном случае распечатать полученный массив методом toString().


import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int [] mas = new int [len];
        long  seed = scan.nextLong(); //вводим начальное значение генератора
        Random rand = new Random(seed); //Создаем объект класса Random
        int control = scan.nextInt();


        for(int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(2, 16); //числа от 2 до 15
        }

        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));

        int ind = Arrays.binarySearch(mas, control);

        if(ind >= 0) {
            int[] copiMas = Arrays.copyOfRange(mas, 0,ind+1);
            System.out.println(Arrays.toString(copiMas));
        }else{
            System.out.println("ERROR");
        }

    }
}