package EXP6.Q2;

/* 
   - GeometricObject (interface)
   - Resizable (interface)
   - Circle (class)
   - ResizableCircle (class)
   - CombinedHierarchy (public class with main)
*/
public class CombinedHierarchy {
    public static void main(String[] args) {
        System.out.println("Hierarchy demo (combined file):\n");

        Circle c = new Circle(2.0);
        System.out.println(c + " perimeter=" + c.getPerimeter() + " area=" + c.getArea());

        ResizableCircle rc = new ResizableCircle(2.0);
        System.out.println(rc + " area=" + rc.getArea());
        rc.resize(50); // increase radius by 50%
        System.out.println("After resize(50): " + rc + " area=" + rc.getArea());
    }
}

interface GeometricObject {
    double getPerimeter();
    double getArea();
}

interface Resizable {
    void resize(int percent);
}

class Circle implements GeometricObject {
    protected double radius = 1.0;

    public Circle() {}

    public Circle(double radius) { this.radius = radius; }

    @Override
    public double getPerimeter() { return 2 * Math.PI * radius; }

    @Override
    public double getArea() { return Math.PI * radius * radius; }

    @Override
    public String toString() { return "Circle(radius=" + radius + ")"; }
}

class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle() { super(); }
    public ResizableCircle(double radius) { super(radius); }

    @Override
    public void resize(int percent) {
        radius = radius * (1 + percent / 100.0);
        if (radius < 0) radius = 0;
    }

    @Override
    public String toString() { return "ResizableCircle(radius=" + radius + ")"; }
}
