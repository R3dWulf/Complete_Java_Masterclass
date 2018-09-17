public class Car extends Vehicle {
    private String bodyType;
    private String transmissionType;
    private String color;
    private int octaneLevel;
    private String gear;

    public Car(String bodyType, String transmissionType, String color, int octaneLevel, String gear) {
        super(165, 3000, 2, 4, 2, 185, "Inline 6");
        this.bodyType = bodyType;
        this.transmissionType = transmissionType;
        this.color = color;
        this.octaneLevel = octaneLevel;
        this.gear = gear;
    }

    public void steerCar(String turnDirection)
    {
        System.out.println("Steering car " + turnDirection);
    }

    public void changeGear(String gear)
    {
        System.out.println("Car is in " + gear + "gear");
    }



    public String getBodyType() {
        return bodyType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public String getColor() {
        return color;
    }

    public int getOctaneLevel() {
        return octaneLevel;
    }

    public String getGear()
    {
        return gear;
    }
}
