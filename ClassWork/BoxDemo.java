import java.util.*;

class Box {
    double width;
    double height;
    double length;  

    Box()
    {
        length = 2;
        width=4;
        height = 5;

    } 

    Box (double length, double width, double height)
    {
        this.length = length;
        this.width = width;
        this.height=height;
    }
    void setDim()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter width, height and length: ");
        width = scan.nextDouble();
        height = scan.nextDouble();
        length = scan.nextDouble();
        System.out.println("Dimensions set: Width = " + width + ", Height = " + height + ", Length = " + length);
    };
    double volume() {
        return width * height * length;
    }

}
class BoxDemo {
    public static void main(String[] args) {
        Box b = new Box();
        b.setDim();
        System.out.println("Volume of the box: " + b.volume());
    }
}