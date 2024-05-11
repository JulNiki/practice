
package Store;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Commodity product = new Commodity();
        product.title = sc.nextLine();
        product.price = sc.nextInt();
        Purchase buying = new Purchase(product, sc.nextInt());
        buying.show();
        product.changePrice(sc.nextInt());
        System.out.println();
        buying.show();
    }
}
