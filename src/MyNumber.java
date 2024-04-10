import java.util.Scanner;
class MyNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();
        int day = sec % 86400;
        int hour = day / 3600;
        int min = (sec % 3600)/60;
        int ost = (sec % 3600) % 60;
        System.out.format("%02d" + ":" + "%02d" + ":" + "%02d", hour, min, ost);
        sc.close();

    }
}