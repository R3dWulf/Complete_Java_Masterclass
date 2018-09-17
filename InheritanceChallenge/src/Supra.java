public class Supra extends Car {
    private String performancePackage;
    private boolean hasRearWing;

    public Supra(String performancePackage, boolean hasRearWing) {
        super("Coupe", "Manual", "Red", 93, "Park");
        this.performancePackage = performancePackage;
        this.hasRearWing = hasRearWing;
    }

    @Override
    public void drive(int speed)
    {
        super.drive(speed);
    }

    @Override
    public void brake(int speed)
    {
        super.brake(speed);
    }


    public void revEngine()
    {
        System.out.println("Vroom! Vroom!");
    }
    public void race()
    {
        revEngine();
        String shiftUp =  super.getGear();
        if(shiftUp == "Park")
        {
            super.changeGear("1");
        }
        else if(shiftUp == "1")
        {
            super.changeGear("2");
        }
        if(shiftUp == "2")
        {
            super.changeGear("3");
        }
        if(shiftUp == "3")
        {
            super.changeGear("4");
        }

        int increaseSpeed = super.getSpeed() + 30;
        drive(increaseSpeed);
    }

    public void brake()
    {
        int decreaseSpeed = super.getSpeed() - 30;
        brake(decreaseSpeed);
    }

    public String getPerformancePackage() {
        return performancePackage;
    }

    public boolean isHasRearWing() {
        return hasRearWing;
    }
}
