package Cars;

public class Truck extends Car{
    private double capacity;

    public Truck(String brand, String owner, double volume, int yearOfMade, double capacity) {
        super(brand, owner, volume, yearOfMade);
        this.capacity = capacity;
    }

    public Truck(double capacity) {
        this.capacity = capacity;
    }


    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    boolean ifCanCarry(double weight) {
        return  (weight > 0 && weight <= capacity);
    }

    @Override
    public String toString() {
        return "Truck{" + "brand='" + super.getBrand() + "', owner='" + super.getOwner() + "', volume=" + super.getVolume() + ", yearOfMade=" + super.getYearOfMade() +
                ", capacity=" + capacity +
                "}";
    }
}
