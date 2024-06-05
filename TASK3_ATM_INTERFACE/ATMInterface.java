package TASK3_ATM_INTERFACE;

import java.util.Scanner;

public class ATMInterface {

    public BankAccountOfUser Account;

    public ATMInterface(BankAccountOfUser Account) {
        this.Account = Account;
    }

    public void ExhibitServices() {
        Scanner S1 = new Scanner(System.in);
        boolean Retreat = false;

        while (!Retreat) {
            System.out.println("ATM Services");
            System.out.println("a. Deposit");
            System.out.println("b. Check Balance");
            System.out.println("c. Withdraw");
            System.out.println("d. Retreat");
            System.out.println(
                    "User can use any of the above services in accordance to their need(to use type in ther form of a,b,c,d) : ");

            char Option = S1.next().charAt(0);

            switch (Option) {
                case 'a':
                    System.out.println("Enter amount to be deposited : ");
                    float DepositAmount = S1.nextFloat();
                    MoneyToBeDeposited(DepositAmount);
                    break;
                case 'b':
                    CheckBalance();
                    break;
                case 'c':
                    System.out.print("Enter amount to be withdrawn : ");
                    float WithdrawnAmount = S1.nextFloat();
                    MoneyToBeWithdrawn(WithdrawnAmount);
                    break;
                case 'd':
                    Retreat = true;
                    System.out.println("Goodbye from the ATM. Thank you for choosing our services!");
                    break;
                default:
                    System.out.println("Oops! That's not a valid choice. Please make a different selection.");
            }

        }
        S1.close();
    }


    private void MoneyToBeDeposited(float Amount) {
        if (Amount <= 0) {
            System.out.println("Sorry, the amount entered is not valid. Please input a positive amount.");
        } 
        else {
            Account.MoneyToBeDeposited(Amount);
            System.out.println("Rs." + Amount + " has been successfully deposited to your bank account.");
        }
    }


    private void CheckBalance() {
        System.out.println("Account balance: Rs." + Account.SeeBalance());
    }


    private void MoneyToBeWithdrawn(float Amount) {
        if (Amount > Account.SeeBalance()) {
            System.out.println("Unfortunately, your balance is too low for this transaction. Please try again.");
        } 
        else if (Amount <= 0) {
            System.out.println("Sorry, the amount entered is not valid. Please input a positive amount.");
        } 
        else {
            Account.MoneyToBeWithdrawn(0);
            System.out.println("Rs." + Amount + " has been successfully withdrawn from your bank account.");
        }
    }



    public static void main(String... args) {
        System.out.println("_______________EazyBank ATM_______________");
     // Implementation
     BankAccountOfUser Account = new BankAccountOfUser(3000); // Initial balance
     ATMInterface AtmOfUser = new ATMInterface(Account);
     AtmOfUser.ExhibitServices();
    }
}
