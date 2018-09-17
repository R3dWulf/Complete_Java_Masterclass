public class Main {

    public static void main(String[] args) {
        Dimensions pcDimensions = new Dimensions(20, 20, 8);
	    Case pcCase = new Case("GC38-XZI", "PC Master", "650", pcDimensions);
        Monitor pcMonitor = new Monitor("SKU:7JSD-5000", "NVidia", 50, new Resolution(7680, 4320));
        Motherboard pcMotherboard = new Motherboard("Z390 Super", "Asus", 4, "v1.01");
        PC thePC = new PC(pcCase, pcMonitor, pcMotherboard);

       thePC.powerUp();

       Wall wall1 = new Wall("North");
       Wall wall2 = new Wall("South");
       Wall wall3 = new Wall("East");
       Wall wall4 = new Wall("West");

       Ceiling ceiling = new Ceiling(12, "raindow");

       Bed bed = new Bed("Modern", 4, 3, 2, 1);

       Lamp lamp = new Lamp("Modern", false, 100);

       Room bedRoom = new Room("TestBedroom", wall1,wall2, wall3, wall4, ceiling, bed, lamp);

       bedRoom.makeBed();

       bedRoom.getLamp().turnOnLamp();




    }
}
