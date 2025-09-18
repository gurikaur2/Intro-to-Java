package LAB_WORK.EXP2;
public class LeftTriangle_pattern {
    public void printLeftTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LeftTriangle_pattern triangle = new LeftTriangle_pattern();
        triangle.printLeftTriangle();
    }
}
