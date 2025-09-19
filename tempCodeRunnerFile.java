/* Write a program to calculate the distance between two points (x1, y1) and (x2, y2). All numbers and return values should be of type double.
 Definition of Done:
DoD 1: Two java files to be defined. One for class definitions and another for the application
DoD 2: A class point is defined with two float variables for x1 and x2 and the following functionality:
i. Non-parametrized and parameterized constructors are defined.
ii. Get and set methods are defined for all the instance variables.
iii. Distance function is defined to calculate the distance between two points.
iv. Display function is defined with width of 7 and precision of 2.
Write this program with a static method definition for calculating the distance between two points.
 */

 import java.util.*;
 class Point {
    double x1, y1, x2, y2;
    Point() {
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
    }
    Point(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public double getX1() {
        return x1;
    }
    public void setX1(double x1) {
        this.x1 = x1;
    }
    public double getY1() {
        return y1;
    }
    public void setY1(double y1) {
        this.y1 = y1;
    }
    public double getX2() {
        return x2;
    }
    public void setX2(double x2) {
        this.x2 = x2;
    }
    public double getY2() {
        return y2;
    }
    public void setY2(double y2) {
        this.y2 = y2;
    }
    public static double distance(Point p) {
        return Math.sqrt(Math.pow((p.x2 - p.x1), 2) + Math.pow((p.y2 - p.y1), 2));
    }
    public void display(double dist) {
        System.out.printf("Distance between the points: %7.2f\n", dist);
    }
 }