//В классе Main описать метод main(), в котором:
//Создать объект класса BusinessTrip
//Считать значения его полей с консоли. При этом в первой строке располагаются фамилия и имя, а во второй - количество дней и транспортные расходы через пробел.
//Вывести данные о командировке методом show()

package BusinessTrip;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BusinessTrip trip = new BusinessTrip();
        trip.name = scan.nextLine();
        trip.days = scan.nextInt();
        trip.transExpenses = scan.nextInt();
        trip.show();
    }
}
