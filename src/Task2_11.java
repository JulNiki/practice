//Программа должна определить зарплату служащего компании.
// Пользователь вводит количество отработанных часов (целое) и почасовой тариф (вещественное).
// Компания платит обычный тариф за первые 20 часов (включительно),
// полуторный тариф за время, отработанное от 20 (не включая) до 40 часов (включительно), и двойной тариф за время свыше 40 часов.
import java.util.Scanner;
public class Task2_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double t = scan.nextDouble();
        double rate = scan.nextDouble();
        double salary = 0;
        if (t < 0 || rate < 0) {
            System.out.println("ERROR");
            return;
        } else if (t <= 20) {
            salary = t * rate;
        } else if (t <= 40){
            salary = 20 * rate + ((t - 20) * rate * 1.5);
        } else if (t > 40){
            salary = 20 * rate + 20 * rate * 1.5 + ((t - 40) * rate * 2) ;
        }

        System.out.printf("%.2f", salary);
    }
}