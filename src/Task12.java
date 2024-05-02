import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double ab = scan.nextDouble();
        double bc = scan.nextDouble();
        double weight = scan.nextDouble();
        double consum = 1;
        double tank = 0;
        if (weight > 2000 || ab > 300 || bc > 300 || weight > 500 && ab > 75  || weight > 500 && bc > 75 || weight > 1000 && ab > 42  || weight > 1000 && bc > 42 || weight > 1500 && ab > 33  || weight > 1500 && bc > 33  ) {
            System.out.println("ERROR");
            return;
        } else if (weight > 1500) {
            consum = 9;
        } else if (weight > 1000) {
            consum = 7;
        } else if (weight > 500) {
            consum = 4;
        }

        tank = ((ab + bc) * consum) - 300;

        if (tank < 0) {
            tank = 0;
        } else if (tank > 300)  {
            System.out.println("ERROR");
            return;
        }

        System.out.printf("%.2f", tank);
    }
}