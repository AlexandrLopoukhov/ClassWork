package lesson150317.pets;

public class Service {

	public static void main(final String[] args) {

		Cat cat = new Cat();
		Dog dog = new Dog();
		Squirrel squirrel = new Squirrel();
		Parrot parrot = new Parrot();
		Hamster hamster = new Hamster();
		Canary canary = new Canary();

		Pet pet = cat;
		Friend friend = cat;
		Object object = cat;

		serve(cat); // Pet pet = cat
		serve(dog);
		serve(squirrel);
		serve(parrot);
		serve(hamster);
		serve(canary);

		cat.walk();
		friend.walk();
		((Cat) object).walk();

	}

	private static void serve(final Pet pet) {
		pet.stroke();
		pet.feed();
		pet.wash();
		pet.brush();
		System.out.println();

	}

}
