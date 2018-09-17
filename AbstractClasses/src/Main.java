public class Main {

    public static void main(String[] args) {
	     Dog dog = new Dog("Bulldog");
	     dog.breath();
	     dog.eat();

	     Falcon falcon = new Falcon("Fred");
	     falcon.eat();
	     falcon.breath();
	     falcon.fly();

	     Penguin penguin = new Penguin("Emperor");
	     penguin.fly();
    }
}
