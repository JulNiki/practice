//В классе Main опишите метод main(), в котором нужно:
//Считать с консоли размер массива. Если введено отрицательное число, то вывести "ERROR" и закончить программу.
//Создать массив сотрудников заданного размера;
//Заполнить массив данными, считав их с консоли. В каждой строке указывается через пробел: фамилия, пол, возраст и зарплата в копейках.
//Для всех пенсионеров задать одинаковую зарплату 90000 копеек.
//Вывести данные о всех сотрудниках в csv - формате, используя метод show(). Информация о каждом сотруднике выводится с новой строки.
package Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        if (len < 0) {
            System.out.println("ERROR");
            return;
        }

        System.out.println();
        Employee[] list = new Employee[len];

        for (int i = 0; i < list.length; i++) {
            list[i] = new Employee(scan.next(), scan.next(), scan.nextInt(), scan.nextInt());
            if (list[i].isPensioner()) {
                list[i].setSalary(90000);
            }
            list[i].show();
            System.out.println();
        }
    }
}
