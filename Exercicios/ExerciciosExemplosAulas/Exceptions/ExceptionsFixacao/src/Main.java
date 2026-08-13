import model.entities.Account;
import model.exception.BalanceException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();

            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdraw = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdraw);
            System.out.println(account);

            System.out.println();
            System.out.print("Enter amount withdraw: ");
            double amountWithdraw = sc.nextDouble();

            account.withdraw(amountWithdraw);
            System.out.println("New balance: "+account.getBalance());
        } catch (BalanceException e){
            System.out.println("Error in account: "+e.getMessage());
        }catch (RuntimeException e){
            System.out.println("Unexpected error");
        }


        sc.close();
    }
}