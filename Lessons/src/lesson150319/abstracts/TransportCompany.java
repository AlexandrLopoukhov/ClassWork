package lesson150319.abstracts;

public class TransportCompany {
	public static void main(final String[] args) {
		Car lada = new Lada();
		Audi audi = new Audi();

		Horse horse = new Horse();
		horse.moveTo(10, 10);

	}
}
