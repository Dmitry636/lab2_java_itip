public class Point3d { // класс создания точек
    private double xCoord; // внутренние элементы
    private double yCoord;
    private double zCoord;
    public Point3d(double x, double y, double z) { // присвоение значений для использования в будущем
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    public Point3d() { // создание точки (0, 0, 0) по умолчанию
        this(0, 0, 0);
    }
    public double getX() { // забрать значение x из точки
        return xCoord;
    }
    public double getY() { // забрать значение y из точки
        return yCoord;
    }
    public double getZ() { // забрать значение z из точки
        return zCoord;
    }
    public void setX(double val) { // установить значение x для точки
        xCoord = val;
    }
    public void setY(double val) { // установить значение y для точки
        yCoord = val;
    }
    public void setZ(double val) { // установить значение z для точки
        zCoord = val;
    }
    public static double distanceTo(Point3d point1, Point3d point2) { // метод расчета расстояния между двумя точками
        // возврат расстояния по формуле
        return Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) +
                Math.pow(point1.getY() - point2.getY(), 2) + Math.pow(point1.getZ() - point2.getZ(), 2));
    }
}
