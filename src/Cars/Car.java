/* Создать класс Car, представляющий автомобиль. */

package Cars;

import java.util.Calendar;

public class Car {
    private String brand;
    private String owner;
    private double volume;
    private int yearOfMade;
    public static int yearNow;


    static {
        Calendar cal = Calendar.getInstance();
        yearNow = cal.get(Calendar.YEAR);
    }

    public Car(String brand, String owner, double volume, int yearOfMade) {
        this.brand = brand;
        this.owner = owner;
        this.volume = volume;
        this.yearOfMade = yearOfMade;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getYearOfMade() {
        return yearOfMade;
    }

    public void setYearOfMade(int yearOfMade) {
        this.yearOfMade = yearOfMade;
    }

    public static int getYearNow() {
        return yearNow;
    }

    //toString( ) – переопределить метод toString() для вывода информации в формате:
    //Car{brand='volvo', owner='Иванов', volume=2.6, yearOfMade=2014}
    @Override
    public String toString() {
        return "Car{" +  "brand='" + brand + "', owner='" + owner + ", volume=" + volume + ", yearOfMade=" + yearOfMade + '}';
    }

    //int getLife( )– расчет возраста автомобиля в годах.

    public int getLife() {
        return yearNow - yearOfMade;
    }

}
