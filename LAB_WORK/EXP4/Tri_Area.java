/* Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.
 */
public class Tri_Area {
    int side1 = 3;
    int side2 = 4;
    int side3 = 5;

    public static void main(String[] args) {
        Tri_Area triangle = new Tri_Area();
        int perimeter = triangle.side1 + triangle.side2 + triangle.side3;
        double s = perimeter / 2.0; // semi-perimeter
        double area = Math.sqrt(s * (s - triangle.side1) * (s - triangle.side2) * (s - triangle.side3));

        System.out.println("Perimeter of the triangle: " + perimeter);
        System.out.println("Area of the triangle: " + area);
    }
}
