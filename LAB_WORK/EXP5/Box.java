/* Define a class Box with the following instance variables: width, height and depth, all of type float. Create a new class BoxWeigth that extends Box to include weight as an instance variable. Write an application that tests the functionalities of both these classes.
Definition of Done:
DoD 1: Three java files to be defined. One for each class definition: Box, BoxWeight and BoxWeightDemo.
DoD 2:  Box and BoxWeight should have three types of constructors defined: clone of an object, all dimensions specified as arguments, no argument.
DoD 3: Super is used to call base class constructors in derived class
DoD 4: Get and set functions defined as applicable in Box and BoxWeight classes.
DoD 5: Function to display volume in Box class and weight in BoxWeigth class */

public class Box {
    float width, height, depth;

    // Parameterized constructor
    public Box(float width, float height, float depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Non-parameterized constructor
    public Box() {
        this.width = 0;
        this.height = 0;
        this.depth = 0;
    }

    // Clone constructor
    public Box(Box b) {
        this.width = b.width;
        this.height = b.height;
        this.depth = b.depth;
    }

    // Getters and Setters
    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    // Method to calculate volume
    public float volume() {
        return width * height * depth;
    }
}
