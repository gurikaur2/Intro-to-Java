package LAB_WORK.EXP2;
public class Diamond_pattern {
    public void printDiamond() {
        int n = 5; // Number of rows for the upper half of the diamond

        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Diamond_pattern diamond = new Diamond_pattern();
        diamond.printDiamond();
    }
}
