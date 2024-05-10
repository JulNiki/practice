//Описать класс BusinessTrip, хранящий информацию о командировочных расходах работников.

package BusinessTrip;

public class BusinessTrip {
final int DAILY_EXPENSES = 25;
String name;
int transExpenses;
int days;

public int getTotal(){
    return transExpenses + days * DAILY_EXPENSES;
}

public void show(){
 System.out.printf("Суточные = %d%nФамилия Имя = %s%nТранспортные расходы = %d%nКоличество дней = %d%nИтого расходы = %d", DAILY_EXPENSES, name, transExpenses, days, getTotal());
}

}
