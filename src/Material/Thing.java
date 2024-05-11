/*разработайте класс Thing, описывающий однородный предмет, состоящий из одного материала.*/

package Material;

public class Thing {
    private String objectName;
    private  Material substanceName;
    private double volume;

    public Thing() {
    }

    public Thing(String objectName, Material substanceName, double volume) {
        this.objectName = objectName;
        this.substanceName = substanceName;
        this.volume = volume;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public void setSubstanceName(Material substanceName) {
        this.substanceName = substanceName;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMass(){
        return volume*substanceName.getDensity();
    }
    //show( ) –   вывод информации об объекте в csv формате. Последним значением выводится масса. Пример:   wire;steel;7850;0.03;235.5
    public void show(){
        System.out.printf("%s;%s;%d;%.2f;%.1f", objectName, substanceName.getSubstanceName(), substanceName.getDensity(),volume,getMass() );
    }
}
