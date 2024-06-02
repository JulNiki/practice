//Пользователь вводит целые числа. Признак конца ввода - слово "finish". Нужно сформировать два списка: для неотрицательных и для отрицательных чисел.
// Отсортировать эти списки по возрастанию и вывести на консоль, отделяя элементы пробелами (сначала список неотрицательных, а затем с новой строки -  список отрицательных).
//Если пользователь вводит строку, которую нельзя преобразовать к целому числу, то считать это число нулем и заносить в первый список!
//Если какой-либо список окажется пустым, то на соответствующем месте нужно вывести "Пустой список".

package Task436;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        while (true) {
            try {
                String buffer = scan.next();
                if ("finish".equals(buffer)) break; //выход из цикла
                int number = Integer.parseInt(buffer);
                if (number >= 0) {
                    list1.add(number);
                } else { //отрицательныe
                    list2.add(number);
                }
            } catch (NumberFormatException ex) {
                list1.add(0);
            }
        }
        Collections.sort(list1);
        Collections.sort(list2);

        if (list1.isEmpty()){
            System.out.println("Пустой список");
        } else {
            for (Integer item : list1) {
                System.out.print(item + " ");
            }
            System.out.println();
        }

        if (list2.isEmpty()){
            System.out.println("Пустой список");
        } else for (Integer item : list2) {
            System.out.print(item + " ");
        }

    }
}
