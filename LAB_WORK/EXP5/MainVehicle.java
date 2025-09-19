/* Create three classes:
Class Vehicle:
Vehicle Class will contain a display() function, which will say "This is a Vehicle".
 Class Car:
Car Class will derive the Vehicle Class and overwrite its display() function. it will say "This is a Car".
Class Bike:
Bike Class will derive the Vehicle Class and overwrite its display() function. it will say "This is a Bike".
 
Write an application that reads an Integer N, which will denote the number of tyres in the vehicle. You have to create an object of the appropriate class according to the value of N and use it display() function.
If N = 2, Create a Bike Object.
If N = 4, Create a Car Object.
Create a Vehicle Object, otherwise.

Definition of Done:
DoD 1: All classes are in a single file.
DoD 2: Switch statement is used for identifying the appropriate class for which the object is to be invoked.
*/

import java.util.Scanner;

class Vehicle {
    void display() {
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a Car");
    }
}

class Bike extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a Bike");
    }
}

public class MainVehicle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of tyres: ");
        int N = scan.nextInt();

        Vehicle v;
        switch (N) {
            case 2:
                v = new Bike();
                break;
            case 4:
                v = new Car();
                break;
            default:
                v = new Vehicle();
        }
        v.display();
    }
}
