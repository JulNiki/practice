//Описать класс Employee, предназначенный для хранения информации  о работниках организации.
//Поля:
//фамилия
//пол
//возраст
//зарплата в копейках (целое число)
//Методы:
//boolean isPensioner() – возвращает true, если сотрудник пенсионного возраста (женщина возраст >= 58 или мужчина возраст >= 63).
//void changeSalary(double koef)  - изменяет зарплату работника, умножая ее на некоторый коэффициент
//void show() - выводит данные о работнике в csv - формате (поля, отделенные точкой с запятой). Пример:  Ivanov; male;48;90000

package Employee;

public class Employee {
    String surname;
    String sex;
    int age;
    int salary ;

    boolean isPensioner(){
        return (((sex.equals("male")) && ( age >= 63)) || ((sex.equals("female")) && ( age >= 58)));
    }

    int changeSalary(double koef){
        return (int) (salary * koef);
    }

    void show(){
        System.out.printf( "%s;%s;%d;%d", surname, sex, age, salary);
    }


}
