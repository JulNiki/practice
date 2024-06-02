/*Создайте  также производный от Pet класс Cat с дополнительным полем: окрас.
 Переопределите методы toString() и getNoise(), чтобы последний выводил на консоль “Мяу-мяу!”.*/

package Pets;

public class Cat extends Pet {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    void getNoise() {
        System.out.printf("Cat %s:Мяу-мяу!\n", getName());
    }

    @Override
    public String toString() {
        return String.format("%s;%d;%s",getName(),getAge(),color);
    }
}
