/* Write a program in java to check if an interface can also extend multiple interfaces. 
 */
package EXP6.Q1_c;

public class CheckInterfaceExtendMultiple {
    


    public static void main(String[] args) {
        System.out.println("Checking multiple interface extension:\n");

        MultiInterfaceExtendsImpl impl = new MultiInterfaceExtendsImpl();
        impl.e();
        impl.f();
        impl.g();
    }
}
interface InterfaceE {
    void e();
}
interface InterfaceF {
    void f();
}
interface InterfaceG extends InterfaceE, InterfaceF {
    void g();
}
class MultiInterfaceExtendsImpl implements InterfaceG {
    @Override
    public void e() {
        System.out.println("Implementing method from Interface E.");
    }

    @Override
    public void f() {
        System.out.println("Implementing method from Interface F.");
    }

    @Override
    public void g() {
        System.out.println("Implementing method from Interface G.");
    }
}

