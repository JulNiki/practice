//Student Поля:
//Фамилия студента;
//Средний балл;
//Возраст.
//Методы:
//Конструкторы;
//Геттеры и сеттеры для всех полей;
//Переопределите метод toString() так, чтобы он возвращал строку, состоящую из значений полей, разделенных точкой с запятой.

package Student;

public class Student {
    private String lastName;
    private double gradeAverage;
    private int age;

    public Student(String lastName, double gradeAverage, int age) {
        this.lastName = lastName;
        this.gradeAverage = gradeAverage;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }


    public double getGradeAverage() {
        return gradeAverage;
    }


    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return String.format("%s;%.1f;%d", getLastName(), getGradeAverage(), getAge());
    }
}
