public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void rest()
    {

    }

    private void moveMuscles()
    {

    }

    public void moveBackFin()
    {

    }

    public void swim(int speed)
    {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
