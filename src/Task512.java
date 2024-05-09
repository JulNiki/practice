/*  Напишите статический метод, который проверяет, есть ли в конце строки подстрока ".com".
Если да, то он возвращает часть строки без этого фрагмента. Если нет, то он возвращает строку без изменения. */
import java.util.Scanner;

class Task512 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(delCom(str));
    }

    public static String delCom(String str){
        String end = str.substring(str.length()-4);
        if ( end.equals(".com")){
            return str.substring(0,str.length()-4);
        } else return str;
    }
}