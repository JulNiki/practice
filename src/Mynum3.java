import java.util.Scanner;
class Mynum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int r = sc.nextInt();
        if ( (Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c)) > r  ) {
            System.out.println("Ура, бастуем!");
        } else {
            System.out.println("За работу, Солнце ещё высоко" );
        }
        sc.close();
    }
}