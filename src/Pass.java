import java.util.Scanner;

class MyProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dbpas = sc.nextLine();
        String pas = sc.nextLine();
        if (pas.equals(dbpas)) {
            System.out.println("Access is granted");
        } else {
            System.out.println("Access is denied");
        }
        sc.close();
    }
}