/*Создайте абстрактный класс Learner (Учащийся) и производные классы Schoolboy (Школьник) и Student (Студент).
Класс Learner должен содержать поля «Фамилия» и «Оценка 1», «Оценка 2», метод для подсчета среднего балла и абстрактный метод «каникулы»,
который возвращает общую продолжительность каникул в году. */

package EducationSector;

public abstract class Learner {
    private String name;
    private int grade1;
    private int grade2;

    public Learner(String name, int grade1, int grade2) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public double averageGrade() {
        return (grade1 + grade2) / 2.;
    }

    abstract int vacation();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade1() {
        return grade1;
    }

    public void setGrade1(int grade1) {
        this.grade1 = grade1;
    }

    public int getGrade2() {
        return grade2;
    }

    public void setGrade2(int grade2) {
        this.grade2 = grade2;
    }
}
