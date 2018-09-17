public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private String bios;

    public Motherboard(String model, String manufacture, int ramSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacture;
        this.ramSlots = ramSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName)
    {
        System.out.println("Program " + programName + " is now loading...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public String getBios() {
        return bios;
    }
}
