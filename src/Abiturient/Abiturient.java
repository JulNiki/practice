package Abiturient;


public class Abiturient {
    private String surname;
    private String name;
    private int math;
    private int physics;
    private int lang;



    public double average() {
        return (math + physics + lang) / 3.;
    }

    public void print(){
        System.out.printf("%s %s математика = %d физика = %d язык = %d средний балл = %.1f", surname, name, math, physics, lang, average());

    }

    public Abiturient(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public Abiturient(String surname, String name, int math, int physics, int lang) {
        this.surname = surname;
        this.name = name;
        this.math = math;
        this.physics = physics;
        this.lang = lang;
    }

    public Abiturient() {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getLang() {
        return lang;
    }

    public void setLang(int lang) {
        this.lang = lang;
    }
}