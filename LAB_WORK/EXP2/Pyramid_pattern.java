package LAB_WORK.EXP2;
public class Pyramid_pattern {   
    public void printPyramid() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pyramid_pattern pyramid = new Pyramid_pattern();
        pyramid.printPyramid();
    }
}
