package Books;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        String author;
        String publisher;
        int year;
        Book myBook = null;
        if (!scan.hasNextLine()) {
            myBook = new Book();
        } else {
            name = scan.nextLine();
            author = scan.nextLine();
            if (!scan.hasNextLine()) {
                myBook = new Book(name, author);
            } else {
                publisher = scan.nextLine();
                if (!scan.hasNextInt()) {
                    myBook = new Book(name, author, publisher);
                } else {
                    year = scan.nextInt();
                    myBook = new Book(name, author, publisher, year);
                }
            }
        }
        System.out.println(myBook);
    }
}
