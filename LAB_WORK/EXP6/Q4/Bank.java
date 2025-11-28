/* Create an abstract class 'Bank' with an abstract method 'getBalance'.
 $100, $150 and $200 are deposited in banks A, B and C respectively. 
 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having 
 a method named 'getBalance'. Call this method by creating an object of 
 each of the three classes */

package EXP6.Q4;
abstract class AbstractBank {
    abstract double getBalance();
}
class BankA extends AbstractBank {
    @Override
    double getBalance() {
        return 100.0;
    }
}
class BankB extends AbstractBank {
    @Override
    double getBalance() {
        return 150.0;
    }
}
class BankC extends AbstractBank {
    @Override
    double getBalance() {
        return 200.0;
    }
}
public class Bank {
    public static void main(String[] args) {
        AbstractBank bankA = new BankA();
        AbstractBank bankB = new BankB();
        AbstractBank bankC = new BankC();

        System.out.println("Balance in Bank A: $" + bankA.getBalance());
        System.out.println("Balance in Bank B: $" + bankB.getBalance());
        System.out.println("Balance in Bank C: $" + bankC.getBalance());
    }
}
