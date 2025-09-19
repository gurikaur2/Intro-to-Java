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
public class Point {
    double x1, y1, x2, y2;

    // Parameterized constructor
    public Point(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Non-parameterized constructor
    public Point() {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
    }

    // Getters and Setters
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

    // Static method to calculate distance
    public static double calculateDistance(Point p) {
        return Math.sqrt(Math.pow((p.x2 - p.x1), 2) + Math.pow((p.y2 - p.y1), 2));
    }

    // Method to display the distance with width of 7 and precision of 2
    public void displayDistance(double distance) {
        System.out.printf("Distance: %7.2f\n", distance);
    }

    // Main method for testing
    public static void main(String[] args) {
        Point point = new Point(3, 4, 7, 8);
        double distance = Point.calculateDistance(point);
        point.displayDistance(distance);
    }
}
