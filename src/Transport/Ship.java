package Transport;

public class Ship implements Transport{
    private double maxWeight;
    private double totalWeight = 0;

    public Ship(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public boolean canCarry(double weight) {
        return weight <= maxWeight;
    }

    @Override
    public void add(double weight) {
        totalWeight += weight > 0? weight: 0;
    }

    @Override
    public double getTotalWeight() {
        return totalWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "maxWeight=" + maxWeight +
                ", totalWeight=" + totalWeight +
                '}';
    }
}
