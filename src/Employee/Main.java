package Employee;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee person = new Employee();
        person.surname = scan.next();
        person.sex = scan.next();
        person.age = scan.nextInt();
        person.salary = scan.nextInt();

        if (person.isPensioner()) {
            person.salary = person.changeSalary(0.9);
        }

        person.show();
    }
}
