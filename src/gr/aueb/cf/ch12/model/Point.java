package gr.aueb.cf.ch12.model;

/**
 * Defines a 2-dimension point.
 */
public class Point {
    private static int noOsPoints = 0;
    private int x;
    private int y;

    public Point() {
        noOsPoints++;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        noOsPoints++;
    }

    public static int getNoOsPoints() {
        return noOsPoints;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
