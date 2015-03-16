package lesson150316;

public class DatabaseDriver {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		DatabaseConnection connection = DatabaseConnection.create();
		DatabaseConnection connection2 = DatabaseConnection.create();
		DatabaseConnection connection3 = DatabaseConnection.create();
		DatabaseConnection connection4 = DatabaseConnection.create();

		if (connection4 == null) {
			connection.free();
		}

		System.out.println(connection);
		System.out.println(connection2);
		System.out.println(connection3);
		System.out.println(connection4);

	}

}
