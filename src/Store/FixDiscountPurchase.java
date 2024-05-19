/* подкласс FixDiscountPurchase  для покупки товара с фиксированной скидкой от цены.  В этом классе имеется дополнительное статическое поле  discount типа double
(размер скидки в долях). Добавьте соответствующие конструкторы,  геттеры и сеттеры для этого поля. Переопределите:
 метод getCost( ) -  стоимость покупки со скидкой. Учтите, что размер скидки округляется в меньшую сторону.
 Например, если скидка 0.1 (т.е. 10%)  для покупки стоимостью 422, то скидка 42 копейки. Стоимость товара тогда 422 - 42 = 380 копеек.
 метод  toString( ): строка формируется из  названия товара, цены, количества, скидки и стоимости покупки. Например: Молоко;211;2;0.1;380*/

package Store;

public class FixDiscountPurchase extends Purchase{
    private static double discount;

    public FixDiscountPurchase(Commodity commodity, int quantityOfCommodity) {
        super(commodity, quantityOfCommodity);
    }

    @Override
    public int getCost() {
        int dis = (int) (discount * 100);
        return super.getCost() - (super.getCost()* dis/100)  ;
    }


    @Override
    public String toString() {
        return getCommodity().getTitle() + ";" + getCommodity().getPrice() + ";" + getQuantityOfCommodity() + ";" + discount + ";" + getCost();
    }

    public static double getDiscount() {
        return discount;
    }

    public static void setDiscount(double discount) {
        FixDiscountPurchase.discount = discount;
    }
}
