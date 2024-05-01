import java.util.Scanner;

import static java.lang.Math.*;

class Task1_5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double a =scan.nextDouble();
        double z = 2 * pow((sin(3*PI-2*a)),2) * pow((cos(5*PI + 2*a)),2) ;
        double y = 0.25 - (0.25 * sin(2.5 * PI - 8 * a));
        System.out.printf("%.5f %.5f",z,y);
    }
}