/* 3.	Create a three-level hierarchy of exceptions. Now create a base-class A with a method that throws an exception at the base of your hierarchy. Inherit B from A and override the method so it throws an exception at level two of your hierarchy. Repeat by inheriting class C from B. In main( ), create a C and upcast it to A, then call the method.
      Definition of Done:
1.  	Create three classes A,B,C
2.  	Display appropriate messages according to the exceptions.
3.  	The program needs to be well commented.
 */

package EXP8.Q3;
class LevelOneException extends Exception {
    public LevelOneException(String message) {
        super(message);
    }
}
class LevelTwoException extends LevelOneException {
    public LevelTwoException(String message) {
        super(message);
    }
}
class LevelThreeException extends LevelTwoException {
    public LevelThreeException(String message) {
        super(message);
    }
}
class A {
    void show() throws LevelOneException {
        throw new LevelOneException("Exception from Level One");
    }
}
class B extends A {
    @Override
    void show() throws LevelTwoException {
        throw new LevelTwoException("Exception from Level Two");
    }
}
class C extends B {
    @Override
    void show() throws LevelThreeException {
        throw new LevelThreeException("Exception from Level Three");
    }
}
public class ExceptionHierarchy {
    public static void main(String[] args) {
        A obj = new C(); // Upcasting C to A
        try {
            obj.show(); // This will call C's show() method
        } catch (LevelThreeException e) {
            System.out.println("Caught: " + e.getMessage());
        } catch (LevelTwoException e) {
            System.out.println("Caught: " + e.getMessage());
        } catch (LevelOneException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
