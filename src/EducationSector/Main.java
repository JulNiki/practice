/*В методе main() класса Main выполнить следующее:
Ввести базовый размер стипендии и задать его в классе Student.
Ввести размер массива и создать массив учащихся.
Заполнить массив учащихся объектами, считав их данные с консоли. Данные каждого учащегося вводятся с новой строки, вначале которого стоит тип объекта: 1 - школьник, 2 - студент.
Затем идут данные, которые отделяются пробелами: фамилия, оценка 1, оценка 2. Далее для школьника следует название школы и название класса, а для студента - название ВУЗа и группы.
Выведите список всех учащихся и продолжительность каникул каждого ( см. пример вывода в тесте).
С новой строки выведите средний балл успеваемости для всех учащихся в массиве (дробная часть этого значения должна иметь один знак).
Выведите список студентов, и с новой строки - сумму всех стипендий студентов. Если в массиве нет студентов, то нужно напечатать "NO", и больше ничего не выводить.*/
package EducationSector;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student.setBaseScholarship(sc.nextInt());

        int len = sc.nextInt();
        if (len < 0) {
            System.out.println("ERROR");
            return;
        }

        Learner[] list = new Learner[len];

        double totalGrade = 0;

        for (int i = 0; i < list.length; i++) {
            int ind = sc.nextInt();
            switch (ind) {
                case 1:
                    list[i] = new Schoolboy(sc.next(), sc.nextInt(), sc.nextInt(), sc.next(), sc.next());
                    totalGrade += list[i].averageGrade();
                    break;
                case 2:
                    list[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.next(), sc.next());
                    totalGrade += list[i].averageGrade();
                    break;
            }
        }

        for (Learner pers : list) {
            System.out.println(pers.toString());
        }

        System.out.printf("%.1f\n", totalGrade / (double) len);

        int sumOfScholarships = 0;

        for (Learner pers : list) {
            if (pers instanceof Student) {
                System.out.println(((Student) pers).info());
                sumOfScholarships += ((Student) pers).calculateScholarship();
            }
        }

        System.out.println(sumOfScholarships == 0 ? "NO" : sumOfScholarships);
    }
}
