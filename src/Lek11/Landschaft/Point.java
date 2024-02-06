package Lek11.Landschaft;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static void main(String[] args) {

        // Punkt mit den Koordinaten (2.0, 3.0) erstellen
        Point point = new Point(2.0, 3.0);

        System.out.println("x-Koordinate: " + point.getX());
        System.out.println("x-Koordinate: " + point.getY());
    }
}