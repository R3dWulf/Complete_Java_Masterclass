import java.util.ArrayList;

public class Account {
    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountNameParam)
    {
        this.accountName =  accountNameParam;
        this.transactions =  new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int addAmountParam)
    {
        if(addAmountParam > 0)
        {
            transactions.add(addAmountParam);
            this.balance += addAmountParam;
            System.out.println(addAmountParam + " deposited. Your account balance is " + this.balance);
        }
        else
        {
            System.out.println("Cannot deposit negative sums");
        }
    }

    public void withdraw(int subtractAmountParam)
    {
        int withdrawal = -subtractAmountParam;
        if(withdrawal < 0)
        {
            transactions.add(withdrawal);
            this.balance += withdrawal;
            System.out.println(subtractAmountParam + " withdrawn. Your account balance is now " + this.balance);
        }
        else
        {
            System.out.print("Cannot withdraw negative sums");
        }
    }

    public void calculateBalance()
    {
        this.balance = 0;
        for( int i : this.transactions)
        {
            this.balance += i;
        }
        System.out.println("This calculated balance is " + this.balance);
    }
}
