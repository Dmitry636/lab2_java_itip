import java.util.Scanner;
// импорт для упрощенного ввода чисел пользователем
public class Lab1 {
    static double a; // объявление стороны треугольника(a)
    static double b; // объявление стороны треугольника(b)
    static double c; // объявление стороны треугольника(c)

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // считывание введенных символов

        System.out.println("Input a first point: "); // считывание чисел для первой точки
        double x1 = in.nextDouble(); // next() - забирает значение до пробела
        // (double - забирает только вещественные числа)
        double y1 = in.nextDouble();
        double z1 = in.nextDouble();

        System.out.println("Input a two point: "); // считывание чисел для второй точки
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double z2 = in.nextDouble();

        System.out.println("Input a three point: "); // считывание чисел для третьей точки
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();
        double z3 = in.nextDouble();

        Point3d point1 = new Point3d(x1, y1,z1); // создание нового объекта из полученных значений
        // (point1 = первая точка)

        Point3d point2 = new Point3d(x2, y2, z2);

        Point3d point3 = new Point3d(x3, y3, z3);

        a = Point3d.distanceTo(point1, point2); // расчет расстояния между двумя точками(длинны сторон - a, b, c)
        a = Math.round((a*100)/100); // округление числа до двух знаков после запятой используя Math.round()

        b = Point3d.distanceTo(point2, point3);
        b = Math.round((b*100)/100);

        c = Point3d.distanceTo(point1, point3);
        c = Math.round((c*100)/100);

        // условие счета площади - если нет двух одинаковых точек
        if (((x1 == x2) && (y1 == y2) && (z1 == z2) || ((x2 == x3) && (y2 == y3) && (z2 == z3))
                || ((x1 == x3) && (y1 == y3) && (z1 == z3)))) {
            System.out.println("Error"); // печать ошибки
        } else {
            System.out.println("Square: " + computeArea()); // расчет площади
        }
    }
    public static double computeArea() { // метод осуществляющий расчет площади
        double p; // полусумма
        double s; // площадь
        p = (a+b+c)/2;
        s = Math.sqrt(p * (p - a)*(p - b)*(p - c)); // формула герона
        return s; // возврат s(площади)
    }
}
