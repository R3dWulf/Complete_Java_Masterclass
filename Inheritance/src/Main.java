public class Main {

    public static void main(String[] args) {
        Animal createAnimal = new Animal("Animal", 1, 1, 5, 10);

        Dog dog = new Dog("Boston terrier",3, 10, 2, 4, 1, 20, "short with black and white color" );
        dog.eat();
        //dog.walk();
        dog.run();
    }
}
