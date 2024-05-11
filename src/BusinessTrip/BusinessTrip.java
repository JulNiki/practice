//Описать класс BusinessTrip, хранящий информацию о командировочных расходах работников.Сделайте все поля приватными согласно принципу инкапсуляции. А методы сделайте публичными.
//Добавьте в класс три разных конструктора, геттеры и сеттеры.
//Создайте четвертый конструктор клонирования.

package BusinessTrip;

import java.util.Objects;

public class BusinessTrip {
private int DAILY_EXPENSES = 25;
private String name;
private int days;
private int transExpenses;

public int getTotal(){
    return transExpenses + days * DAILY_EXPENSES;
}

public void show(){
 System.out.printf("Суточные = %d%nФамилия Имя = %s%nТранспортные расходы = %d%nКоличество дней = %d%nИтого расходы = %d", DAILY_EXPENSES, name, transExpenses, days, getTotal());
}

    public BusinessTrip(int DAILY_EXPENSES, String name,int days, int transExpenses) {
        this.DAILY_EXPENSES = DAILY_EXPENSES;
        this.name = name;
        this.days = days;
        this.transExpenses = transExpenses;
    }

    public BusinessTrip() {
    }

    public BusinessTrip(String name, int days, int transExpenses) {
        this.name = name;
        this.days = days;
        this.transExpenses = transExpenses;
    }

    public BusinessTrip(BusinessTrip trip) {
        this.DAILY_EXPENSES = DAILY_EXPENSES;
        this.name = trip.name;
        this.days = trip.days;
        this.transExpenses = trip.transExpenses;
    }

    public int getDAILY_EXPENSES() {
        return DAILY_EXPENSES;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTransExpenses() {
        return transExpenses;
    }

    public void setTransExpenses(int transExpenses) {
        this.transExpenses = transExpenses;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    //toString() - данные должны выводиться в csv - формате. Например: Шумский;4;28;128
    @Override
    public String toString() {
        return name + ';' + days + ";" + transExpenses + ";"+ getTotal();
    }

    //equals() и hashCode() - равными считаются командировки, у которых равны общие расходы.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusinessTrip trip = (BusinessTrip) o;
        return getTotal() == trip.getTotal() ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTotal());
    }
}
