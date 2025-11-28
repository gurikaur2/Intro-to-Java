/* Create a Java package called exercises. Inside the exercises package, create another package (subpackage) called java. 
Create a Java class called PackageDemo inside the java package. Insert a display() method inside the PackageDemo class.
Inside the method, insert this statement:System.out.println("PackageDemo executed");Write a PackageDemoDriver class within the 
same package to run the display () method of PackageDemo class. */

package EXP7.Q1;

public class PackageDemoDriver {
    public static void main(String[] args) {
        PackageDemo demo = new PackageDemo();
        demo.display();
    }
}
