//Считать с консоли размер массива. Если введено отрицательное число, то напечатать ERROR и закончить программу.
//Создать массив покупок (типа Purchase) нужного размера.
//Заполнить массив данными, считав их с консоли. Гарантируется корректность исходных данных в тестах, поэтому проверять их не нужно.
//Определить максимальную стоимость покупки. Вывести все покупки с данной стоимостью в csv - формате.
package Store;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        if (len <= 0) {
            System.out.println("ERROR");
            return;
        }

        Purchase[] buying = new Purchase[len];
        int costMax = 0;
        int ind = 0;
        for (int i = 0; i < buying.length; i++) {
            Commodity product = new Commodity(scan.next(), scan.nextInt());
            buying[i] = new Purchase(product, scan.nextInt());
            int costOfCurrentPurchase = buying[i].getCost();
            if (costMax < costOfCurrentPurchase) {
                costMax = costOfCurrentPurchase;
                ind = i;
            }
        }

        for (int i = 0; i < buying.length; i++){
            if (buying[i].equals(buying[ind])) {
                System.out.println(buying[i]);
            }
        }

    }
}
