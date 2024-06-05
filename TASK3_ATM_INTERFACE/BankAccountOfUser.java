package TASK3_ATM_INTERFACE;

public class BankAccountOfUser{
    public float Balance;

    public BankAccountOfUser(float PreExistingFunds){
        this.Balance = PreExistingFunds;
    }
    public float SeeBalance(){
         return Balance;
    }
    public void MoneyToBeDeposited(float Amount){
        Balance = (Amount > 0) ? Balance + Amount : Balance;

    }
    public void MoneyToBeWithdrawn(float Amount){
        Balance = (Amount > 0 && Amount <= Balance) ? Balance - Amount : Balance;

    }
}