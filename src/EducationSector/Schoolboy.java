/*Класс Schoolboy имеет дополнительно поля «школа» и «класс».*/

package EducationSector;

public class Schoolboy extends Learner{
    private String school;
    private String classroom;

    public Schoolboy(String name, int grade1, int grade2, String school, String classroom) {
        super(name, grade1, grade2);
        this.school = school;
        this.classroom = classroom;
    }

    @Override
    int vacation() {
        return 124;
    }

    //В каждом классе должен быть переопределен метод toString(), который возвращает строку из значений полей в csv - формате (поля отделяются точкой с запятой).
    // пример: Коваленко;6;8;СШ10;9Б каникулы: 124
    @Override
    public String toString() {
        return String.format("%s;%d;%d;%s;%s каникулы: %s", getName(), getGrade1(), getGrade2(), school, classroom, vacation());
    }
}
