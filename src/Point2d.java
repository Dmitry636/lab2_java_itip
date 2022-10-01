public class Point2d {
    private double xCoord;
    private double yCoord;

    public Point2d(double x, double y) {
        xCoord = x;
        yCoord = y;
        System.out.println(getX());
        System.out.println(getY());
    }
    public Point2d() {
        this(0, 0);
    }
    public double getX() {
        return xCoord;
    }
    public double getY() {
        return yCoord;
    }
    public void setX(double val) {
        xCoord = val;
    }
    public void setY(double val) {
        yCoord = val;
    }

    public static void main(String[] args) {
        System.out.println(new Point2d(10.0, 5.1));
    }
}