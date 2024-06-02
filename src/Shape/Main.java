/*Введите размер массива и создайте массив фигур, для которых можно подсчитать площадь.
Заполните массив объектами, считав их данные с консоли. В начале каждой строки стоит тип объекта: 1 - прямоугольник, 2 - куб.
Затем идут длины сторон (для прямоугольника две стороны, для куба - одна). Все данные отделяются пробелами.
Перебрав массив, распечатайте площади всех фигур, отделяя их пробелами. В конце этой строки тоже должен быть пробел. Площади округляются до двух знаков после десятичной точки.
Переведите курсор на новую строку. Еще раз переберите массив и найдите прямоугольник с максимальной площадью (если площади одинаковые, выбирается прямоугольник с меньшим индексом).
.*/

package Shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        if (len < 0) {
            System.out.println("ERROR");
            return;
        }

        IShape[] figures = new IShape [len];
        for (int i = 0; i < figures.length; i++) {
            int ind = sc.nextInt();
            switch (ind) {
                case 1: figures[i] = new Rectangle(sc.nextDouble(), sc.nextDouble());
                break;
                case 2: figures[i] = new Cube(sc.nextDouble());
                break;
            }
        }

        for (IShape figure: figures ){
            System.out.printf( "%.2f ", figure.computeSquare());
        }
        System.out.println();


        double maxAreaRerctangle = 0;
        int id = -1;
        for (int i = 0; i < figures.length; i++){
            if (figures[i] instanceof Rectangle && figures[i].computeSquare() > maxAreaRerctangle){
                maxAreaRerctangle = figures[i].computeSquare();
                id = i;
            }
        }
//Выведите информацию о нем в формате: Прямоугольник сторона 1 = 3.45, сторона 2 = 2.67 Площадь = 9.21    Если же в массиве нет ни одного прямоугольника, то выведите слово ERROR
        System.out.println((id == -1) ? "ERROR" : String.format("Прямоугольник сторона 1 = %.2f, сторона 2 = %.2f Площадь = %.2f", ((Rectangle) figures[id]).getSideA(), ((Rectangle) figures[id]).getSideB(), figures[id].computeSquare()));

    }
}
