//Пользователь вводит данные студентов, разделенные пробелами (каждого студента с новой строки).
// Предположите, что ошибок в данных не будет! Сформируйте два списка: один для студентов моложе 18 лет, а другой - для совершеннолетних студентов.
//Выведите списки студентов на консоль используя метод toString(), переопределенный для коллекций. Если список пуст, то выведите сообщение "Пустой список".

package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Student> listAdult = new ArrayList<>();
        ArrayList<Student> listUnderage = new ArrayList<>();



        while (true) {
            String buffer = scan.nextLine();
                if ("end".equals(buffer)) break; //выход из цикла
                String[] parts = buffer.split(" ");
                int age = Integer.parseInt(parts[2]);
                double ball = Double.parseDouble(parts[1]);
                if (age >= 18) {
                    listAdult.add(new Student(parts[0],ball, age));
                } else {
                    listUnderage.add( new Student(parts[0], ball, age ));
                }
        }

        if (listUnderage.isEmpty()){
            System.out.println("Пустой список");
        } else {
            System.out.println(listUnderage);
        }

        if (listAdult.isEmpty()){
            System.out.println("Пустой список");
        } else {
            System.out.println(listAdult);
        }


    }
}
