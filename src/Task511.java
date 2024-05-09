/*  Напишите метод, который проверяет, что строка является адресом почты gmail.com (т.е. в конце строки "@gmail.com", и знак @ только один).  */
import java.util.Scanner;

class Task511 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (isGMailAddress(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isGMailAddress(String str){
        String end = str.substring(str.length()-10);
        return  ( end.equals("@gmail.com") &&  str.lastIndexOf("@", (str.length()-11)) == -1);

    }
}