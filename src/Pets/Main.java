/*В методе main() класса Main выполнить следующее:
Ввести размер массива и создать массив домашних животных.
Заполнить массив объектами, считав их данные с консоли. В начале каждой строки стоит тип объекта: 1 - собака, 2 - кот. Затем идут данные, которые отделяются пробелами: кличка и возраст.
 Далее для собаки следует порода, а для кота - окрас.Выведите список всех домашних животных в массиве.
Для каждого животного должно быть выведено название класса, затем пробел и кличка, далее двоеточие и издаваемый звук. Например: Dog Мухтар:Гав-гав!
Выведите пустую строку.
Затем вывести список всех котов в массиве в csv-формате.*/
package Pets;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        if (len < 0) {
            System.out.println("ERROR");
            return;
        }

        Pet[] pet = new Pet[len];
        for (int i =0; i < pet.length; i++){
            int ind = sc.nextInt();
            switch (ind){
                case 1:
                    pet[i] = new Dog(sc.next(), sc.nextInt(),sc.next());
                    break;
                case 2:
                    pet[i] = new Cat(sc.next(), sc.nextInt(),sc.next());
                    break;
            }
        }

        for (Pet pets: pet) {pets.getNoise();}

        System.out.println();

        for (Pet pets: pet) {
            if (pets instanceof Cat) System.out.println(pets.toString());
        }
    }
}