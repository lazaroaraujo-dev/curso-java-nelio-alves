import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;


public class Main {
    public static void main(String[] args) {
        Account acc = new Account("Lázaro", 1001, 0.0);
        BusinessAccount bacc = new BusinessAccount("Joana", 1002, 0.0, 500.0);
        SavingsAccount svacc = new SavingsAccount("João", 1003, 1200.0, 10.0);

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount("Maria", 1004, 0.0, 1200.0);
        Account acc3 = new SavingsAccount("José", 1005, 0.0, 10.0);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.00);

        if (acc3 instanceof  BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.00);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }

        Account acc6 = new Account("Júnior", 1006, 1000.0);
        acc6.withDraw(200.0);
        System.out.println(acc6.getBalance());

        Account acc7 = new SavingsAccount("Maria", 1007, 1000.0, 0.01);
        acc7.withDraw(200.0);
        System.out.println(acc7.getBalance());

        Account acc8 = new BusinessAccount("Juan", 1007, 1000.0, 500.0);
        acc8.withDraw(200.0);
        System.out.println(acc8.getBalance() );
    }
}