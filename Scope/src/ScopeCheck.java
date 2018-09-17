public class ScopeCheck {

    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck()
    {
        System.out.println("ScopeCheck created, publicVar " + publicVar + " and varOne = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo()
    {
        int varTwo = 2;
        for (int i=0; i<10; i++)
        {
            System.out.println(i + " times two is " + i * varTwo);
        }
    }

    public void useInner()
    {
        InnerClass innerClass = new InnerClass();
        System.out.println("A method calling varThree " + innerClass.varThree + " outside InnerClass");
    }

    public class InnerClass{
        private int varThree = 3;

        public InnerClass()
        {
            System.out.println("InnerClass created, varOne is " + varOne + " and varThree is " + varThree);
        }

        public void timesTwo()
        {
            //int varOne = 2;
            //ScopeCheck.this.timesTwo();
            System.out.println("varOne is " + varOne + " and still available here");
            for (int i=0; i<10; i++)
            {
                //System.out.println(i + " times two is " + i * varOne);
                //System.out.println(i + " times two is " + i * ScopeCheck.this.varOne); // uses the defined varOne field up top.
                System.out.println(i + " times three is " + i * varThree);
            }
        }

    }
}
