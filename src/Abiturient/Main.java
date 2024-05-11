package Abiturient;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Abiturient[] list = new Abiturient[3];
        list[0] = new Abiturient();
        list[1] = new Abiturient("Петров", "Андрей", 90, 70, 80);
        list[2] = new Abiturient("Алексиевич", "Анна");
        list[0].setSurname(scan.next());
        list[2].setPhysics(scan.nextInt());
        list[2].setMath(scan.nextInt());
        list[2].setLang(scan.nextInt());
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                System.out.printf("%s : %.1f\n", list[i].getSurname(), list[i].average());
            }
        }
    }
}
