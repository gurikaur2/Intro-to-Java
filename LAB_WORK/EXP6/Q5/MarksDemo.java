/* We have to calculate the percentage of marks obtained in three 
subjects (each out of 100) by student A and in four subjects (each out of 100)
 by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'
 It is inherited by two other classes 'A' and 'B' each having a method with the same
  name which returns the percentage of the students. The constructor of student
  A takes the marks in three subjects as its parameters and the marks in 
  four subjects as its parameters for student B. Create an object for each 
  of the two classes and print the percentage of marks for both the students. */

package EXP6.Q5;
abstract class Marks {
    abstract double getPercentage();
}
class A extends Marks {
    private double subject1;
    private double subject2;
    private double subject3;

    public A(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    double getPercentage() {
        return (subject1 + subject2 + subject3) / 3.0;
    }
}
class B extends Marks {
    private double subject1;
    private double subject2;
    private double subject3;
    private double subject4;

    public B(double subject1, double subject2, double subject3, double subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    double getPercentage() {
        return (subject1 + subject2 + subject3 + subject4) / 4.0;
    }
}
public class MarksDemo {
    public static void main(String[] args) {
        Marks studentA = new A(85, 90, 78);
        Marks studentB = new B(88, 76, 92, 81);

        System.out.println("Percentage of marks obtained by Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of marks obtained by Student B: " + studentB.getPercentage() + "%");
    }
}
