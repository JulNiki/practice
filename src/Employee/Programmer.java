/*Создайте подкласс  Programmer - программист.
Дополнительные поля:
String status - может принимать значения: junior, middle, senior.
String specialization - может принимать значения: frontend, backend, fullstack, mobile.
Добавьте необходимые конструкторы, геттеры и сеттеры. Переопределите метод show так, чтобы в конце строки стоял статус программиста. Например:   Ivanov; male;48;90000;middle*/
package Employee;

public class Programmer extends Employee{
    private String status;
    private String specialization;

    public Programmer(String surname, String sex, int age, int salary, String status, String specialization) {
        super(surname, sex, age, salary);
        this.status = status;
        this.specialization = specialization;
    }

    public void setStatus(String status) {
        if (status.equals("junior") || status.equals("middle") || status.equals("senior")) {
            this.status = status;
        } else {
            System.out.println("Неверный статус программиста.");
        }
    }


    public void setSpecialization(String specialization) {
        if (specialization.equals("frontend") || specialization.equals("backend") ||
                specialization.equals("fullstack") || specialization.equals("mobile")) {
            this.specialization = specialization;
        } else {
            System.out.println("Неверная специализация программиста.");
        }
    }

    public String getStatus() {
        return status;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public void show() {
        System.out.printf( "%s;%s;%d;%d;%s\n", super.getSurname(), super.getSex(), super.getAge(), super.getSalary(),status);
    }
}
