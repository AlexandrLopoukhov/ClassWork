package Instance_of_example;

import lesson150317.pets.Cat;
import lesson150317.pets.Dog;
import lesson150317.pets.Friend;
import lesson150317.pets.Hamster;
import lesson150317.pets.Parrot;
import lesson150317.pets.Pet;

public class UsePets {
	public static void main(final String[] args) {
		Pet[] pets = { new Cat(), new Dog(), new Hamster(), new Parrot() };

		walkWith(pets);
	}

	private static void walkWith(final Pet[] pet) {
		for (Pet pet2 : pet) {
			if (pet2 instanceof Friend) {
				{
					((Friend) pet2).walk();
				}
			}
		}
	}
}
