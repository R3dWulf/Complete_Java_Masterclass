public class Main {

    public static void main(String[] args) {
        Account testAccount = new Account("Test");
        testAccount.deposit(100);
        testAccount.deposit(-25);
        testAccount.withdraw(50);
        testAccount.withdraw(-45);
        testAccount.calculateBalance();

        System.out.println("The current account balance for Test is: " + testAccount.getBalance());
    }
}
