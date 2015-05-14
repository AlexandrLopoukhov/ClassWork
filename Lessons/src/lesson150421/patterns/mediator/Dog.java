package lesson150421.patterns.mediator;

public class Dog {
<<<<<<< HEAD
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
=======
	
	private Cat _cat;
	private Parrot _parrot;

	public void setCat(final Cat cat) {
		_cat = cat;
	}

	public void setParrot(final Parrot parrot) {
		_parrot = parrot;
	}
	
	public void biteEar() {
		// TODO Auto-generated method stub
		
	}

	public void дразнит() {
		// TODO Auto-generated method stub
		
>>>>>>> refs/remotes/zaal/master
	}

}
