package Shape;

public class Cube implements IShape{
    private double sideA;

    public Cube(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double computeSquare() {
        return 6*sideA*sideA;
    }
}