import java.util.*;

class Circle {

    float radius = 2;

    float findArea() {
        return (float) (Math.PI * radius * radius);
    }

    void displayArea() {
        System.out.println("Area of Circle: " + findArea());
    }
}

class CircleDemo {

    Circle c = new Circle();

    float newradius(float r) {
        System.out.println("Area of Circle with radius 2 : " + c.findArea());
        c.radius = r;
        return c.findArea();
    }

    public static void main(String[] args) {
        CircleDemo demo = new CircleDemo();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius of the circle with radius: ");
        float r = scan.nextFloat();
        float area = demo.newradius(r);
        demo.c.displayArea();
    }
}