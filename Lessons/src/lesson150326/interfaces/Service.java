package lesson150326.interfaces;

public class Service {
	public static void main(final String[] args) {
		Furniture[] things = { new Chair(), new SurgeryTable(),
				new KitchenTable() };

		serv(things);
		Cleanable[] x = { new Cat(), new Chair() };
		clean(x);
	}

	private static void clean(final Cleanable[] things) {
		// TODO Auto-generated method stub
		for (Cleanable furniture : things) {
			furniture.clean();
		}
	}

	private static void serv(final Furniture[] things) {
		// TODO Auto-generated method stub
		for (Furniture furniture : things) {
			furniture.move();
			furniture.clean();
			furniture.move();
		}
	}
}
