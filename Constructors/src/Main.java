public class Main {

    public static void main(String[] args) {
	    //BankAccount test = new BankAccount(0000001, 0.00,"Kevin", "kevin@minion.com", "(555)-555-5555");
        BankAccount test = new BankAccount();
//	    test.setCustomerName("Paul Smith");
//        test.setAccountNumber(000001);
//        test.setAccountBalance(0);
//        test.setCustomerEmail("email@email.com");
//        test.setCustomerPhoneNumber("555-555-5555");

        //test.DepositFunds(500);
        //test.WithdrawFunds(128.27);

//        System.out.println("Namer: " + test.getCustomerName());
//        System.out.println("Account Number: " +test.getAccountNumber());
//        System.out.println("Email: " + test.getCustomerEmail());
//        System.out.println("Phone Number: " +test.getCustomerPhoneNumber());
//        System.out.println("Current Balance: " + test.getAccountBalance());

//        BankAccount myNewlyOpenedAccount = new BankAccount("Bob", "bob@email.com", "(123)-456-7890");
//
//        System.out.println("Account Name: " +  myNewlyOpenedAccount.getCustomerName()  );
//        System.out.println("Current Balance: " + myNewlyOpenedAccount.getAccountBalance() );

//        VipCustomer caffiene = new VipCustomer("CodeMonkey", "cm@email.com", 10000.00);
//
//        System.out.println("Account Name: " + caffiene.getVipCustomerName() );
//        System.out.println("Contact Info: " + caffiene.getVipCustomerEmail() );
//        System.out.println("Current Limit: " + caffiene.getVipCustomerCreditLimit() );

        VipCustomer coffee = new VipCustomer();
        System.out.println("Account Name: " + coffee.getVipCustomerName() );
        System.out.println("Contact Info: " + coffee.getVipCustomerEmail() );
        System.out.println("Current Limit: " + coffee.getVipCustomerCreditLimit() );


    }
}
