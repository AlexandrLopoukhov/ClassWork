package lesson150317.pets;

public class Pet {
	public void brush() {
		System.out.println("Brushing " + this);

	}

	public void wash() {
		System.out.println("Washing " + this);

	}

	public void feed() {
		System.out.println("Feeding " + this);

	}

	public void stroke() {

		System.out.println("Stroking " + this);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName();
	}

}
