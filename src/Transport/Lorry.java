package Transport;

public class Lorry implements Transport{
    private double maxWeight;
    private double totalWeight = 0;

    public Lorry(double maxWeight) {
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

    //Lorry{maxWeight=5.0, totalWeight=0.0}


    @Override
    public String toString() {
        return "Lorry{" +
                "maxWeight=" + maxWeight +
                ", totalWeight=" + totalWeight +
                '}';
    }
}


