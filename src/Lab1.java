public class Lab1 {
    public static void main(String[] args) {
        // Point3d p1 = new Point3d(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]));
        // Point3d p2 = new Point3d(Double.parseDouble(args[3]), Double.parseDouble(args[4]), Double.parseDouble(args[5]));
        // Point3d p3 = new Point3d(Double.parseDouble(args[6]), Double.parseDouble(args[7]), Double.parseDouble(args[8]));
        // First triangle
        Point3d p1 = new Point3d(10, 10, 10);
        Point3d p2 = new Point3d(11, 12, 13);
        Point3d p3 = new Point3d(15, 16, 11);
        System.out.println("Square First triangle: " + computeArea(p1, p2, p3)); // расчет площади

        // Second triangle
        Point3d p4 = new Point3d(1, 2, 3);
        Point3d p5 = new Point3d(2, 3, 11);
        Point3d p6 = new Point3d(7, 1, 6);
        System.out.println("Square Second triangle: " + computeArea(p4, p5, p6)); // расчет площади

        // Three triangle
        Point3d p7 = new Point3d(10, 10, 10);
        Point3d p8 = new Point3d(10, 10, 10);
        Point3d p9 = new Point3d(15, 16, 11);
        System.out.println("Square Three triangle: " + computeArea(p7, p8, p9)); // расчет площади
    }
    public static double computeArea(Point3d point1, Point3d point2, Point3d point3) {
        // метод осуществляющий расчет площади(вход - три точки)
        double p; // полусумма
        double s; // площадь
        double a; // первая сторона
        double b; // вторая сторона
        double c; // третья сторона

        a = Point3d.distanceTo(point1, point2);
        b = Point3d.distanceTo(point2, point3);
        c = Point3d.distanceTo(point1, point3);

        if (Point3d.compare(point1, point2, point3)) {
            System.out.println("Error"); // если есть одинаковые точки вывод ошибки
            return 0.0; // возврат
        } else {
            p = (a + b + c) / 2; // расчет полусуммы
            s = Math.sqrt(p * (p - a) * (p - b) * (p - c)); // формула герона
            String result = String.format("%.2f", s);
            return Double.parseDouble(result.replace(",", ".")); // возврат s(площади)
        }
    }
}
