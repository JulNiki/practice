//Описать класс Purchase, описывающий покупку товара.

package Store;


public class Purchase {
    Commodity commodity;
    int quantityOfCommodity;

    public Purchase(Commodity commodity, int quantityOfCommodity) {
        this.commodity = commodity;
        this.quantityOfCommodity = quantityOfCommodity;
    }

    private int getCost(){
        return quantityOfCommodity * commodity.price;
    }

    public void show(){
        System.out.printf("Наименование товара: %s\nЦена товара: %d\nКоличество: %d\nСтоимость покупки: %d\n", commodity.title, commodity.price, quantityOfCommodity, getCost());
    }

}
