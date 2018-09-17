public class Bed {
    private String bedStyle;
    private int pillows;
    private int height;
    private int sheets;
    private int quilts;

    public Bed(String bedStyle, int pillows, int height, int sheets, int quilts) {

        this.bedStyle = bedStyle;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilts;
    }

    public void make()
    {
        System.out.print("Pulling the sheets over the bed");
    }

    public String getBedStyle() {
        return bedStyle;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilts() {
        return quilts;
    }


}
