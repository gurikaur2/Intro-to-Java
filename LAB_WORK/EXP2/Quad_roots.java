public class Quad_roots {
    public static void main(String[] args) {
        int root;
        double a, b, c, d, r1, r2;
        System.out.println("Enter coefficients a, b and c:");  
        java.util.Scanner scan = new java.util.Scanner(System.in);
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();      
        d = b * b - 4 * a * c; 
        if (d > 0) {
            r1 = (-b + Math.sqrt(d)) / (2 * a);
            r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and different.");
            System.out.println("Root 1 = " + r1);
            System.out.println("Root 2 = " + r2);
        } else if (d == 0) {
            r1 = r2 = -b / (2 * a);
            System.out.println("Roots are real and same.");
            System.out.println("Root 1 = Root 2 = " + r1);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);
            System.out.println("Roots are complex and different.");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }
        
    }
}
