//Описать класс Commodity, описывающий товар.

package Store;

public class Commodity {
    private String title;
    private int price;

    public void show(){
        System.out.printf("Наименование товара: %s%nЦена товара: %d%n", title, price);
    }

    public void changePrice(int price){
        this.price = price;
    }

    public Commodity(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public Commodity() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return title + ';' + price + ';';
    }
}
