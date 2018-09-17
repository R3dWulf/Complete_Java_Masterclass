public class DogMain {

    public static void main(String[] args) {
        Labrador rover = new Labrador("Rover");

        Dog anotherDogNamedRover = new Dog("Rover");

        System.out.println(anotherDogNamedRover.equals(rover)); // true
        System.out.println(rover.equals(anotherDogNamedRover)); // using override: false

    }
}
