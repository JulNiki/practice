/* Создайте абстрактный класс Pet. Поля: кличка, возраст. Определите конструкторы, геттеры и сеттеры.
Переопределите метод  toString() (должен выдавать все поля в csv-формате). Задайте абстрактный метод void getNoise();
 */

package Pets;

public abstract class Pet {
    private String name;
    private int age;

    abstract void getNoise();

    @Override
    public String toString() {
        return "name + ';' + age +';'";
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
