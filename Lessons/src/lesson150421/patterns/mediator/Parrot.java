package lesson150421.patterns.mediator;

public class Parrot {
	private Dog dog;
	private Cat cat;

	public void catchHim() {
		// TODO Auto-generated method stub

	}

	public void play() {
		getDog().дразнит();
		getCat().flyAway();
	}

	/**
	 * @return the dog
	 */
	public Dog getDog() {
		return dog;
	}

	/**
	 * @param dog
	 *            the dog to set
	 */
	public void setDog(final Dog dog) {
		this.dog = dog;
	}

	/**
	 * @return the cat
	 */
	public Cat getCat() {
		return cat;
	}

	/**
	 * @param cat
	 *            the cat to set
	 */
	public void setCat(final Cat cat) {
		this.cat = cat;
	}

}
