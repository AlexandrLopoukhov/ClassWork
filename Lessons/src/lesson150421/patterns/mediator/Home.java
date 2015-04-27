package lesson150421.patterns.mediator;

public class Home {
	public static void main(final String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Parrot parrot = new Parrot();
		dog.setCat(cat);
		dog.setParrot(parrot);
		parrot.setCat(cat);
		parrot.setDog(dog);
		cat.setDog(dog);
		cat.setParrot(parrot);

	}
}
