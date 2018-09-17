public class Password {
    private static final int key = 27592759;
    private final int encrytedPassword;

    public Password(int encrytedPassword) {
        this.encrytedPassword = encryptDecrypt(encrytedPassword);
    }

    private int encryptDecrypt(int passwordParam)
    {
        return passwordParam ^ key;
    }

    public final void storePassword()
    {
        System.out.print("Saving password as " + this.encrytedPassword);
    }

    public boolean letMeIn(int passwordParam)
    {
        if(encryptDecrypt(passwordParam) == this.encrytedPassword)
        {
            System.out.print("Welcome");
            return true;
        }
        else
        {
            System.out.print("You, shall not pass!");
            return false;
        }
    }
}
