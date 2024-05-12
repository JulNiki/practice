/*В методе main() класса Main выполнить следующее (корректность вводимых данных гарантируется, можно ее не проверять):
Ввести размер массива автомобилей.
Создать массив из ссылок на класс Car нужного размера и заполнить его данными, считывая их с консоли. Данные при вводе отделяются пробелами.
Ввести номер  автомобиля (номер считается с 1) и объем  двигателя. Изменить данные об этом автомобиле в массиве, задав сеттером  этот новый объем двигателя.
Вывести массив на консоль с использованием метода toString( ).
Вывести пустую строку.
Найти самый новый автомобиль в массиве и распечатать его данные.*/
package Cars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        Car cars[] = new Car[len];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(sc.next(), sc.next(), sc.nextDouble(), sc.nextInt());
        }

        int ind = sc.nextInt();

        cars[ind-1].setVolume(sc.nextDouble());

        for (Car car : cars){
            System.out.println(car);
        }

        int young = cars[0].getLife();
        for (int i = 1; i < cars.length; i++) {
            if (cars[i].getLife() < young) {
                young = cars[i].getLife();
            }
        }
        System.out.println();

        for (Car car : cars){
            if (car.getLife() == young) {
                System.out.println(car);
            }
        }


    }
}
