package LAB_WORK.EXP6;
/* Write a program in java to check if a class can extends another class and/ 
can implement one and more than one interface. */ 

public class CheckClass {
    public static void main(String[] args) {
        System.out.println("Rule: a class may extend one class and implement multiple interfaces.\n");

        ChildExtends child = new ChildExtends();
        child.parentMethod();
        child.childMethod();

        OneInterfaceImpl oneImpl = new OneInterfaceImpl();
        oneImpl.one();

        MultiInterfaceImpl multiImpl = new MultiInterfaceImpl();
        multiImpl.a();
        multiImpl.b();

        // Class that extends Parent and implements two interfaces
        ChildExtendsAndImpl both = new ChildExtendsAndImpl();
        both.parentMethod();
        both.a();
        both.b();
    }

     
}

class Parent {
    void parentMethod() {
        System.out.println("This is a method from the Parent class.");
    }
}
class ChildExtends extends Parent {
    void childMethod() {
        System.out.println("This is a method from the Child class.");
    }
}
interface OneInterface {
    void one();
}
class OneInterfaceImpl implements OneInterface {
    @Override
    public void one() {
        System.out.println("Implementing one interface.");
    }
}
interface InterfaceA {
    void a();
}
interface InterfaceB {
    void b();
}
class MultiInterfaceImpl implements InterfaceA, InterfaceB {
    @Override
    public void a() {
        System.out.println("Implementing method from Interface A.");
    }

    @Override
    public void b() {
        System.out.println("Implementing method from Interface B.");
    }
}

// Extends Parent and implements both interfaces
class ChildExtendsAndImpl extends Parent implements InterfaceA, InterfaceB {
    @Override
    public void a() {
        System.out.println("ChildExtendsAndImpl: a() implemented");
    }

    @Override
    public void b() {
        System.out.println("ChildExtendsAndImpl: b() implemented");
    }
}

