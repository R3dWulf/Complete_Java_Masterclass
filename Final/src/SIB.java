public class SIB {
    public static final String owner;

    static{
        owner = "Fred";
        System.out.println("SIB test static initialization block called");
    }

    public SIB()
    {
        System.out.println("SIB constructor called");
    }

    static{
        System.out.println("2nd initialization block called");
    }

    public void someMethod()
    {
        System.out.println("Some method called");
    }
}
