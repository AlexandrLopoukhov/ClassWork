package lesson150421.patterns.mediator;

public class Cat {
<<<<<<< HEAD
	private Dog dog;
	private Parrot parrot;

	public void play() {
		getDog().biteEar();
		getParrot().catchHim();
	}

	public void flyAway() {
		// TODO Auto-generated method stub

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
	 * @return the parrot
	 */
	public Parrot getParrot() {
		return parrot;
	}

	/**
	 * @param parrot
	 *            the parrot to set
	 */
	public void setParrot(final Parrot parrot) {
		this.parrot = parrot;
=======
	
	public void setDog(final Dog dog) {
		_dog = dog;
	}

	public void setParrot(final Parrot parrot) {
		_parrot = parrot;
	}

	private Dog _dog;
	private Parrot _parrot;

	public void play() {
		_dog.biteEar();
		_parrot.catchHim();
	}

	public void flyAway() {
		// TODO Auto-generated method stub
		
>>>>>>> refs/remotes/zaal/master
	}

}
