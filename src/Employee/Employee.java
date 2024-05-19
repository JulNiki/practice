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
    private String surname;
    private String sex;
    private int age;
    private int salary ;

    public boolean isPensioner(){
        return (((sex.equals("male")) && ( age >= 63)) || ((sex.equals("female")) && ( age >= 58)));
    }

    public int changeSalary(double koef){
        return (int) (salary * koef);
    }

    public void show(){
        System.out.printf( "%s;%s;%d;%d\n", surname, sex, age, salary);
    }

    public Employee() {
    }

    public Employee(String surname, String sex, int age, int salary) {
        this.surname = surname;
        this.sex = sex;
        this.age = age;
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
