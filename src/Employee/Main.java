//Ввести количество элементов массива и создать массив ссылочных переменных типа Employee соответствующего размера.
//Заполнить массив данными, считав их с консоли. Данные о сотруднике вводятся с новой строки. Первым числом идет тип сотрудника (1 - тип Employee, 2 - тип Programmer, 3 - тип Accountant). Затем указывается  фамилия, пол, возраст в годах, зарплата. Для программистов указывается в конце строки статус и специализация. А для бухгалтеров - группа профстандарта. Данные отделяются пробелами.   Напоминаю: у  Сканнера нет метода для чтения символа. Поэтому нужно группу профстандарта считывать как строку, а  потом передавать в конструктор нулевой символ этой строки: gruppa.charAt(0)
//Выведите массив на консоль, каждый элемент с новой строки (используйте  метод show()).
//Рассчитайте общий фонд заработной платы на месяц (сумму зарплат всех сотрудников) и выведите ее с новой строки.
//Найдите сотрудника с самой большой зарплатой и выведите информацию о нем с новой строки методом show(). Если таких человек несколько, то выводим данные только первого из них (первый максимум).
//Пропустите строку, а затем сформируйте команду программистов для frontend - разработки. Выведите список сотрудников на консоль. Также используйте метод show(). Если нужных сотрудников нет, то выведите "NO".
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
        int payroll = 0;

        for (int i = 0; i < list.length; i++) {
            int ind = scan.nextInt();
            switch (ind){
                case 1:
                    list[i] = new Employee(scan.next(), scan.next(), scan.nextInt(), scan.nextInt());
                    break;
                case 2:
                    list[i] = new Programmer(scan.next(), scan.next(), scan.nextInt(), scan.nextInt(), scan.next(), scan.next());
                    break;
                case 3:
                    list[i] = new Accountant (scan.next(), scan.next(), scan.nextInt(), scan.nextInt(), scan.next().charAt(0));
                    break;
            }
            payroll += list[i].getSalary();
        }

        for (Employee pers : list){pers.show();}
        System.out.println();
        System.out.println(payroll);

        int indMaxSalary = 0;
        for (int i = 1; i < list.length; i++) {
            if (list[indMaxSalary].getSalary()  < list[i].getSalary()){
                indMaxSalary = i;
            }
        }
        list[indMaxSalary].show();
        System.out.println();

        for (Employee pers : list) {
            if (pers instanceof Programmer && ((Programmer) pers).getSpecialization().equals("frontend")) {
                pers.show();
            }
        }
    }
}
