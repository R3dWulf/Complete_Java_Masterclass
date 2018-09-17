public class BankAccount {

    private int accountNumber = 0;
    private double accountBalance = 0;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public BankAccount()
    {
        this(00000, 0.00, "Default Name", "Default Email", "Default Phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this(00000, 0.00, customerName, customerEmail, customerPhoneNumber); // initializing default value
    }

    public BankAccount(int accNumber, double accBalance, String custName, String custEmail, String custPhone)
    {
        this.accountNumber = accNumber;
        //setAccountNumber(accNumber);
        this.accountBalance = accBalance;
        this.customerName = custName;
        this.customerEmail = custEmail;
        this.customerPhoneNumber = custPhone;
        System.out.println("Account created");

        /**
         * Best practice states to set/initialize field value from
         * the constructor, not the setter and
         * call only other constructors from a constructor
         **/
    }

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance)
    {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail)
    {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber)
    {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public int getAccountNumber()
    {
        return this.accountNumber;
    }

    public double getAccountBalance(){
        return this.accountBalance;
    }

    public String getCustomerName()
    {
        return this.customerName;
    }

    public String getCustomerEmail()
    {
        return this.customerEmail;
    }

    public String getCustomerPhoneNumber()
    {
        return this.customerPhoneNumber;
    }

    public void DepositFunds(double amountToAdd)
    {
        this.accountBalance += amountToAdd;
        System.out.println("Your money was deposited successfully into your account in the amount of " + amountToAdd);
    }

    public void WithdrawFunds(double amountToSubtract)
    {
        if(this.accountBalance - amountToSubtract < 0 )
        {
            System.out.println("Insufficient funds in account to make withdraw.");
        }
        else
        {
            this.accountBalance -= amountToSubtract;
        }
    }
}
