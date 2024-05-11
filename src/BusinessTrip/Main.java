//В классе Main в методе main() напишите код, в котором нужно:
//Считать с консоли размер массива. Если введено отрицательное число, то напечатать ERROR и закончить программу.
//Создать массив командировок (типа BusinessTrip) нужного размера.
//Заполнить массив данными, считав их с консоли, кроме последней командировки. Гарантируется корректность исходных данных в тестах, поэтому проверять их не нужно.
//Последний объект в массиве создать с помощью конструктора клонирования, сделав его копией элемента массива с индексом 0.
//Изменить фамилию в командировке с индексом 0, считав данные с консоли.
//Вывести список всех командировок в csv-формате. Затем вывести пустую строку.
//Ввести с консоли индекс командировки (корректность не проверяем). Вывести в csv - формате все командировки, которые считаются равными элементу массива с этим индексом (включая и сам этот элемент).

package BusinessTrip;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        if (len <= 0) {
            System.out.println("ERROR");
            return;
        }

        BusinessTrip[] trips = new BusinessTrip[len];
        for (int i = 0; i < trips.length-1; i++) {
            trips[i] = new BusinessTrip(scan.next(), scan.nextInt(), scan.nextInt());
        }

        trips[len-1] = new BusinessTrip(trips[0]);

        trips[0].setName(scan.next());


        for (int i = 0; i < trips.length; i++) {
            System.out.println(trips[i]);
        }
        System.out.println();

        int ind = scan.nextInt();
        for (int i = 0; i < trips.length; i++) {
           if (trips[i].equals(trips[ind])){
                System.out.println(trips[i]);
            }
        }
    }
}
