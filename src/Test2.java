import java.util.Scanner;
class Mynum4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Math.abs(sc.nextInt());
        int b = sc.nextInt();
        String st_a = Integer.toString(a);
        char num2 = st_a.charAt(1);
        int num = Character.getNumericValue(num2);

        if (a < 100 || a > 999) {
            System.out.println("error");
        } else if (num == b) {
            System.out.println( "true");
        } else {
            System.out.println( "false");
        }
    }
}