/*Класс Student имеет дополнительные поля «ВУЗ», «группа»  и статическое поле «базовый размер стипендии»,
а также метод для расчета стипендии в зависимости от среднего балла. */
package EducationSector;

public class Student extends Learner{
    private String university;
    private String group;
    private static int baseScholarship;

    public Student(String name, int grade1, int grade2, String university, String group) {
        super(name, grade1, grade2);
        this.university = university;
        this.group = group;
    }

    public int calculateScholarship(){
        if(averageGrade() >= 9){
            return (int)(baseScholarship * 1.6);
        }else if(averageGrade() >= 8){
            return (int)(baseScholarship * 1.4);
        }else if(averageGrade() >= 6){
            return (int)(baseScholarship * 1.2);
        }else if(averageGrade() >= 5){
            return baseScholarship;
        }else{
            return 0;
        }
    }


    @Override
    int vacation() {
        return 74;
    }
//В каждом классе должен быть переопределен метод toString(), который возвращает строку из значений полей в csv - формате (поля отделяются точкой с запятой).
// пример: Покровский;9;10;БТЭУ;G21 каникулы: 74
    @Override
    public String toString() {
        return String.format("%s;%d;%d;%s;%s каникулы: %s", getName(), getGrade1(), getGrade2(), university, group, vacation());
    }

    public String info() {
        return String.format("%s;%d;%d;%s;%s", getName(), getGrade1(), getGrade2(), university, group);
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public static int getBaseScholarship() {
        return baseScholarship;
    }

    public static void setBaseScholarship(int baseScholarship) {
        Student.baseScholarship = baseScholarship;
    }
}
