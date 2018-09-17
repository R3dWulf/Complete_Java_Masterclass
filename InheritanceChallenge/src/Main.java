public class Main {

    public static void main(String[] args) {
        //Vehicle startBuildingTheCar = new Vehicle();
        //Car addMoreStuffToCar = new Car();
	    Supra dreamCar = new Supra("Twin Turbo", true);

	    //dreamCar.revEngine();
        dreamCar.race();
        dreamCar.steerCar("Hard Left!");
        dreamCar.brake();
    }
}
