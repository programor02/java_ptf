package ru.stqa.pft.sandbox;

public class Point {
    public double x;
    public double y;
    public double x1;
    public double y1;

    public Point(double x, double y, double x1, double y1){
        this.x = x; this.x1 = x1;
        this.y = y; this.y1 = y1;
    }
    public double distance () {
        double ac = this.x1 - this.x;
        double bc = this.y1 - this.y;
        return Math.sqrt(Math.pow(ac, 2) + Math.pow(bc, 2));
    }

}
