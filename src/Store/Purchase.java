//Описать класс Purchase, описывающий покупку товара.
//Сделайте все поля приватными, а методы публичными (в том числе метод getCost()).
//Добавьте в класс два разных конструктора, геттеры и сеттеры  для всех полей.


package Store;


import java.util.Objects;

public class Purchase {
    private Commodity commodity;
    private int quantityOfCommodity;

    public Purchase(Commodity commodity, int quantityOfCommodity) {
        this.commodity = commodity;
        this.quantityOfCommodity = quantityOfCommodity;
    }



    public Purchase() {
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public int getQuantityOfCommodity() {
        return quantityOfCommodity;
    }

    public void setQuantityOfCommodity(int quantityOfCommodity) {
        this.quantityOfCommodity = quantityOfCommodity;
    }

    public int getCost(){
        return quantityOfCommodity * commodity.getPrice();
    }

    public void show(){
        System.out.printf("Наименование товара: %s\nЦена товара: %d\nКоличество: %d\nСтоимость покупки: %d\n", commodity.getTitle(), commodity.getPrice(), quantityOfCommodity, getCost());
    }

    // метод toString() так, чтобы данные выводились в csv - формате (название, цена, количество, стоимость покупки. Например: Сахар;260;5;1300
    @Override
    public String toString() {
        return commodity.getTitle() + ";" + commodity.getPrice() + ";" + quantityOfCommodity + ";" + getCost();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchase purchase = (Purchase) o;
        return getCost() == purchase.getCost();
    }

    @Override
    public int hashCode() {
        return Objects.hash(commodity, quantityOfCommodity);
    }
}
