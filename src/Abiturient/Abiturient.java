package Abiturient;


public class Abiturient {
    String surname;
    String name;
    int math;
    int physics;
    int lang;

    public double average() {
        return (math + physics + lang) / 3.;
    }

    public void print(){
        System.out.printf("%s %s математика = %d физика = %d язык = %d средний балл = %.1f", surname, name, math, physics, lang, average());

    }
}