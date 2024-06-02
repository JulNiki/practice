/*Создать производный класс Dog с дополнительным полем: порода.  Переопределите метод toString(). Переопределите метод getNoise(), чтобы он выводил на консоль “Гав-гав!”.

 */
package Pets;

public class Dog extends Pet {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    void getNoise() {
        System.out.printf("Dog %s:Гав-гав!\n", getName());
    }

    @Override
    public String toString() {
        return String.format("%s;%d;%s",getName(),getAge(),breed);
    }
}
