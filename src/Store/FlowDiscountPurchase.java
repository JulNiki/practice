/* FlowDiscountPurchase.  скидка предоставляется в случае, если количество единиц товара не меньше некоторого заданного объема.
Дополнительные статические поля: discount (размер скидки), minAmount (заданный объем товара, с которого начинает действовать скидка).
Добавьте конструкторы, геттеры и сеттеры для статических полей.
Переопределить нужные методы:
метод getCost( ) -  стоимость покупки.
метод  toString( ): строка формируется из  названия товара, цены, количества, процента скидки, порога действия скидки  и стоимости покупки. Например: Молоко;211;2;0.1;2;380*/
package Store;

public class FlowDiscountPurchase extends Purchase {
    private static double discount;
    private static int minAmount;

    public FlowDiscountPurchase(Commodity commodity, int quantityOfCommodity) {
        super(commodity, quantityOfCommodity);
    }

    public FlowDiscountPurchase(Commodity commodity) {
        super(commodity);
    }


    public static double getDiscount() {
        return discount;
    }

    public static void setDiscount(double discount) {
        FlowDiscountPurchase.discount = discount;
    }

    public static int getMinAmount() {
        return minAmount;
    }

    public static void setMinAmount(int minAmount) {
        FlowDiscountPurchase.minAmount = minAmount;
    }

    @Override
    public int getCost() {
        int cost = super.getCost();
        if (super.getQuantityOfCommodity() >=  minAmount) {
            int dis = (int) (discount * 100);
            cost = super.getCost() - (super.getCost()*dis/100);
        }

        return cost;
    }



    @Override
    public String toString() {
        return getCommodity().getTitle() + ";" + getCommodity().getPrice() + ";" + getQuantityOfCommodity() + ";" + discount + ";" + minAmount + ";" + getCost();
    }
}