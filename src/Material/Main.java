package Material;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Material steel = new Material("steel", 7850);
        Thing object1 = new Thing("wire", steel,0.03 );
        object1.show();
        System.out.println();
        Material copper = new Material("copper", 8500);
        object1.setVolume(sc.nextDouble());
        object1.setSubstanceName(copper);
        object1.show();
        sc.close();

    }
}
