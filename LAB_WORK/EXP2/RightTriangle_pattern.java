package LAB_WORK.EXP2;
public class RightTriangle_pattern {
    public void printRightTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RightTriangle_pattern triangle = new RightTriangle_pattern();
        triangle.printRightTriangle();
    }
}
