public class Main {

    public static void main(String[] args) {
//	    SomeClass one = new SomeClass("one");
//	    SomeClass two = new SomeClass("two");
//	    SomeClass three = new SomeClass("three");
//
//		System.out.println(one.getInstanceNumber());
//		System.out.println(two.getInstanceNumber());
//		System.out.println(three.getInstanceNumber());
//
//		int pword = 720511;
//		//Password password = new Password(pword);
//		Password password = new ExtendedPassword(pword);
//		password.storePassword();
//
//		password.letMeIn(1);
//		password.letMeIn(20277);
//		password.letMeIn(-56307);
//		password.letMeIn(720511);

		System.out.println("Main method called");

		SIB test = new SIB();
		test.someMethod();
		System.out.println("Owner is " + SIB.owner);

    }
}
