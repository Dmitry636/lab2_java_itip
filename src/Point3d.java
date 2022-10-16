public class Point3d extends Point2d { // наследование из Point2d
    private double zCoord; // третья координата
    public Point3d(double x, double y, double z) { // присвоение значений для использования в будущем
        super(x, y); // вытаскиваем из Point2d значения x и y
        zCoord = z;
    }
    public Point3d() { // создание точки (0, 0, 0) по умолчанию
        this(0, 0, 0);
    }
    public double getZ() { // забрать значение z из точки
        return zCoord;
    }
    public void setZ(double val) { // установить значение z для точки
        zCoord = val;
    }
    public static double distanceTo(Point3d point1, Point3d point2) { // метод расчета расстояния между двумя точками
        double res = Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) +
                Math.pow(point1.getY() - point2.getY(), 2) + Math.pow(point1.getZ() - point2.getZ(), 2));
        String n = String.format("%.2f", res); // округление до двух знаков после запятой(точки)
        return Double.parseDouble(n.replace("," , ".")); // вывод double с заменой запятой на точку
    }
    public static boolean compare(Point3d point1, Point3d point2, Point3d point3){
        // метод сравнивающий значения двух точек (вывод true = совпадают, вывод false = не совпадают)
        return (point1.getX() == point2.getX() & point1.getY() == point2.getY() & point1.getZ() == point2.getZ()) ||
               (point2.getX() == point3.getX() & point2.getY() == point3.getY() & point2.getZ() == point3.getZ()) ||
               (point1.getX() == point3.getX() & point1.getY() == point3.getY() & point1.getZ() == point3.getZ());
    }
}
