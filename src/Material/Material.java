//Разработайте класс Material, описывающий некоторый физический материал (вещество).


package Material;

public class Material {
    private String substanceName;
    private int density;

    public Material() {
    }

    public Material(String substanceName, int density) {
        this.substanceName = substanceName;
        this.density = density;
    }

    public String getSubstanceName() {
        return substanceName;
    }

    public int getDensity() {
        return density;
    }
}
