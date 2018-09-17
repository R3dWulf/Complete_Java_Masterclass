public class ExtendedPassword extends Password {
    private int decryptedPassword;

    public ExtendedPassword(int passwordParam)
    {
        super(passwordParam);
        this.decryptedPassword = passwordParam;
    }

//    @Override
//    public void storePassword()
//    {
//        System.out.println("Saving password as " + this.decryptedPassword);
//    }
}
