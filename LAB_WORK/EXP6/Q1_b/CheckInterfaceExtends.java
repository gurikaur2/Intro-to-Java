/* Write a program in java to check if an interface can extend other interface. */
package EXP6.Q1_b;

public class CheckInterfaceExtends {
    public static void main(String[] args) {
        System.out.println("Checking interface extension:\n");

        InterfaceExtendsImpl impl = new InterfaceExtendsImpl();
        impl.c();
        impl.d();
    }
}

interface InterfaceC {
    void c();
}

interface InterfaceD extends InterfaceC {
    void d();
}

class InterfaceExtendsImpl implements InterfaceD {
    @Override
    public void c() {
        System.out.println("Implementing method from Interface C.");
    }

    @Override
    public void d() {
        System.out.println("Implementing method from Interface D.");
    }
}

