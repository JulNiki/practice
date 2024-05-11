//Описать класс Commodity, описывающий товар.

package Store;

public class Commodity {
    String title;
    public int price;

    void show(){
        System.out.printf("Наименование товара: %s%nЦена товара: %d%n", title, price);
    }

    void changePrice(int price){
        this.price = price;
    }

}
