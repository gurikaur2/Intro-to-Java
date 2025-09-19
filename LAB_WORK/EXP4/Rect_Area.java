/* Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its constructor and having a method named 'returnArea' which returns the area of the rectangle. Length and breadth of the rectangle are entered through the keyboard.
 */
public class Rect_Area {   
    int length = 5;
    int breadth = 10;
    public static void main(String[] args) {
        Rect_Area rectangle = new Rect_Area();
        int area = rectangle.length * rectangle.breadth;
        System.out.println("Area of the rectangle: " + area);
    }
}
