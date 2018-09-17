/*

    What is the accessibility level of:
    1.) Accessible interface?
    2.) someConstant?
    3.) methodA()?
    4.) methodB() and methodC()?

 */

interface Accessible {
    int someConstant = 100;
    public void methodA();
    void methodB();
    boolean methodC();
}

/*
    Answer:
    1.) Public - there is no package required
    2.) Public
    3.) Public
    4.) Public
 */
