//Ввести количество элементов массива и создать массив ссылочных переменных типа Car соответствующего размера.
//Заполнить массив данными, считав их с консоли. Данные о машине вводятся с новой строки.
// Первым числом идет тип автомобиля (1 - тип Car, 2 - тип Truck). Затем указывается марка, фамилия владельца, объем двигателя, год выпуска.
// Для грузовиков указывается в конце строки грузоподъемность. Данные отделяются пробелами.
//Выведите массив на консоль, каждый элемент с новой строки (используйте переопределенный метод toString()).
//Выведите пустую строку
//Введите вес груза в отдельную переменную, и выведите список всех грузовиков, которые могут перевезти этот вес, и при этом имеют возраст не старше 6 лет.
// Если подходящих автомобилей нет, выведите "NO".
package Cars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        Car cars[] = new Car[len];

        for (int i = 0; i < cars.length; i++) {
            int ind = sc.nextInt();
            switch (ind) {
                case 1:
                    cars[i] = new Car(sc.next(), sc.next(), sc.nextDouble(), sc.nextInt());
                    break;
                case 2:
                    cars[i] = new Truck(sc.next(), sc.next(), sc.nextDouble(), sc.nextInt(), sc.nextDouble());
                    break;
            }
        }

        for (Car car : cars){
            System.out.println(car);
        }

        System.out.println();

        double cargoWeight = sc.nextDouble();

        boolean suitableCars = false;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] instanceof Truck && ((Truck)cars[i]).ifCanCarry(cargoWeight) && cars[i].getLife() <=6)  {
                System.out.println(cars[i]);
                suitableCars = true;
            }
        }

        if (suitableCars == false) {
            System.out.println("NO");
        }

    }
}
