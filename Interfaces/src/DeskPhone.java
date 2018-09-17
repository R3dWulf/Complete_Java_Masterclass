public class DeskPhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Beep! Desk phone was turned on");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now calling: " + phoneNumber  + " from desk phone");
    }

    @Override
    public void answer() {
        if(isRinging)
        {
            System.out.println("Hello, this it the front desk");
            isRinging =  false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber)
        {
            isRinging = true;
            System.out.println("Desk phone is ringing");
        }
        else
        {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
