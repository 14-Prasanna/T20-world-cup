package interface_handon;
import java.util.Scanner;

class Customer {
    String name;
    String city;

    Customer(String name, String city) {
        this.name = name;
        this.city = city;
    }
}

class Account {
    int accNo;
    double balance;

    Account(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
}
interface RBI {

    double getInterestRate();

    double getWithdrawalLimit();

}
class SBI implements RBI {

    public double getInterestRate() {
        return 4.5;
    }

    public double getWithdrawalLimit() {
        return 25000;
    }
}class ICICI implements RBI {

    public double getInterestRate() {
        return 5.0;
    }

    public double getWithdrawalLimit() {
        return 30000;
    }
}class PNB implements RBI {

    public double getInterestRate() {
        return 4.2;
    }

    public double getWithdrawalLimit() {
        return 20000;
    }
}


public class handson4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. SBI");
        System.out.println("2. ICICI");
        System.out.println("3. PNB");

        System.out.print("Choose Bank: ");
        int choice = sc.nextInt();

        RBI bank;

        switch(choice) {

        case 1:
            bank = new SBI();
            break;

        case 2:
            bank = new ICICI();
            break;

        case 3:
            bank = new PNB();
            break;

        default:
            System.out.println("Invalid Bank");
            return;
        }

        System.out.println("Interest Rate: " + bank.getInterestRate());
        System.out.println("Withdrawal Limit: " + bank.getWithdrawalLimit());

        sc.close();
    }
}
