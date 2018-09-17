public class Main {

    public static void main(String[] args) {
	    ITelephone testPhone;
	    // or
        // DeskPhone testPhone;
	    testPhone = new DeskPhone(1234567890);
	    testPhone.powerOn();
	    testPhone.callPhone(1234567890);
        testPhone.answer();

        testPhone = new MobilePhone(987654321);
        testPhone.powerOn();
        testPhone.callPhone(987654321);
        testPhone.answer();
    }
}
