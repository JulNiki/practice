import java.util.Scanner;
class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        if (a.charAt(0) < b.charAt(0) && a.charAt(0) < c.charAt(0)) {
            System.out.println(a);
        } else if (b.charAt(0) < a.charAt(0) && b.charAt(0) < c.charAt(0)) {
            System.out.println(b);
        }  else if (c.charAt(0) < a.charAt(0) && c.charAt(0) < b.charAt(0)) {
            System.out.println(c);
        }

        if ((a.charAt(0) > b.charAt(0) && a.charAt(0) < c.charAt(0)) || (a.charAt(0) > c.charAt(0) && a.charAt(0) < b.charAt(0))) {
            System.out.println(a);
        }  else if ((b.charAt(0) > a.charAt(0) && b.charAt(0) < c.charAt(0)) || (b.charAt(0) > c.charAt(0) && b.charAt(0) < a.charAt(0))) {
            System.out.println(b);
        } else if ((c.charAt(0) > a.charAt(0) && c.charAt(0) < b.charAt(0)) || (c.charAt(0) > b.charAt(0) && c.charAt(0) < a.charAt(0))) {
            System.out.println(c);
        }

        if (a.charAt(0) > b.charAt(0) && a.charAt(0) > c.charAt(0))  {
            System.out.println(a);
        }  else if (b.charAt(0) > a.charAt(0) && b.charAt(0) > c.charAt(0)) {
            System.out.println(b);
        } else if (c.charAt(0) > a.charAt(0) && c.charAt(0) > b.charAt(0)) {
            System.out.println(c);
        }


        sc.close();

    }
}
