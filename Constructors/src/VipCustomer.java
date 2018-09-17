public class VipCustomer {
    private String vipCustomerName;
    private String vipCustomerEmail;
    private double vipCustomerCreditLimit = 0;

    public VipCustomer() {
        this("John Doe", "jdoe@email.com", 0.00);
        //Calling third constructor to create default values
    }

    public VipCustomer(String customerName, String customerEmail) {
        this(customerName, customerEmail, 0.00);
        //Fill out customer name and email with default account balance of zero;
    }

    public VipCustomer(String customerName, String customerEmail, double customerLimit) {
        this.vipCustomerName = customerName;
        this.vipCustomerEmail = customerEmail;
        this.vipCustomerCreditLimit = customerLimit;
        System.out.println("Account created");

        // create and save customer account with all info filled out
    }

    public String getVipCustomerName() {
        return vipCustomerName;
    }

    public String getVipCustomerEmail() {
        return vipCustomerEmail;
    }

    public double getVipCustomerCreditLimit() {
        return vipCustomerCreditLimit;
    }
}
