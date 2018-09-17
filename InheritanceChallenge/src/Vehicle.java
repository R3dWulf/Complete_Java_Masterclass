public class Vehicle {
    private int length;
    private int weight;
    private int doors;
    private int windows;
    private int seats;
    private int speed;
    private String engine;

    public Vehicle()
    {

    }


    public Vehicle(int length, int weight, int doors, int windows, int seats, int speed, String engine) {
        this.length = length;
        this.weight = weight;
        this.doors = doors;
        this.windows = windows;
        this.seats = seats;
        this.speed = speed;
        this.engine = engine;
    }

    public void drive(int speed)
    {
        System.out.println("Driving vehicle at " + speed + " speed");
    }

    public void brake(int lowerSpeed)
    {
        System.out.println("Reduced speed to: " + speed);
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public int getSeats() {
        return seats;
    }

    public int getSpeed() {
        return speed;
    }

    public String getEngine() {
        return engine;
    }



}
