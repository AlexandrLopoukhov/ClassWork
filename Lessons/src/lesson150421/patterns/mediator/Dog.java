package lesson150421.patterns.mediator;

public class Dog {
	private Cat cat;
	private Parrot parrot;

	public void biteEar() {
		// TODO Auto-generated method stub

	}

	public void дразнит() {
		// TODO Auto-generated method stub

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
	}

}
