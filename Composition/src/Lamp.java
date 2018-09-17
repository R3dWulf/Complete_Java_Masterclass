public class Lamp {
    private String lampStyle;
    private boolean hasBattery;
    private int luminousRating;

    public Lamp(String lampStyle, boolean hasBattery, int luminousRating) {
        this.lampStyle = lampStyle;
        this.hasBattery = hasBattery;
        this.luminousRating = luminousRating;
    }

    public void turnOnLamp()
    {
        System.out.println("Click!");
    }

    public String getLampStyle() {
        return lampStyle;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public int getLuminousRating() {
        return luminousRating;
    }
}
