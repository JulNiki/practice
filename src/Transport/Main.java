//Введите размер массива и создайте массив транспортных средств.
//Заполните массив объектами, считав их данные с консоли. В начале каждой строки стоит тип объекта: 1 - грузовик, 2 - корабль.
// Затем идет грузоподъемность транспортного средства. Все данные отделяются пробелами.
//Введите вес груза.
//Для каждого транспортного средства проверьте,  может ли оно перевезти этот груз. Если да – нагрузите его.
//Распечатайте содержимое массива, используя метод toString() так, как это показано в примере теста.

package Transport;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        if (len <= 0 ){
            System.out.println("Error");
            return;
        }

        Transport[] vehicles = new Transport[len];
        for (int i = 0; i < vehicles.length; i++){
            int type = sc.nextInt();
            switch (type){
                case 1:
                    vehicles[i] = new Lorry(sc.nextDouble());
                    break;
                case 2:
                    vehicles[i] = new Ship(sc.nextDouble());
                    break;
            }
        }

        double weight = sc.nextDouble();

        for (Transport vehicle: vehicles) {
            if (vehicle.canCarry(weight)){
                vehicle.add(weight);
            }
        }

        for (Transport vehicle: vehicles){
            System.out.println(vehicle);
        }

    }
}
