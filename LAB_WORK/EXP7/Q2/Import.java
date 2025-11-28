/* Write a java program outside the above defined package that imports the package PackageDemo and calls its display() function */
package EXP7.Q2;

import EXP7.Q1.PackageDemo;

public class Import {
    public static void main(String[] args) {
        PackageDemo demo = new PackageDemo();
        demo.display();
    }
}
