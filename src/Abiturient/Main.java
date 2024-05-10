package Abiturient;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Abiturient person = new Abiturient();
        person.surname = scan.next();
        person.name = scan.next();
        person.math = scan.nextInt();
        person.physics = scan.nextInt();
        person.lang = scan.nextInt();
        System.out.printf("%.1f\n", person.average());
        person.print();
    }
}
