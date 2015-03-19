package lesson150316;

public class DatabaseDriver {

<<<<<<< HEAD
	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
=======
	public static void main(final String[] args) {
		
>>>>>>> remotes/zaal/master
		DatabaseConnection connection = DatabaseConnection.create();
		DatabaseConnection connection2 = DatabaseConnection.create();
		DatabaseConnection connection3 = DatabaseConnection.create();
		DatabaseConnection connection4 = DatabaseConnection.create();
<<<<<<< HEAD

		if (connection4 == null) {
			DatabaseConnection.free();
		}

=======
		
		if (connection4 == null) {
			DatabaseConnection.freeAny();
//			connection.free();  or like this
		}
		
>>>>>>> remotes/zaal/master
		System.out.println(connection);
		System.out.println(connection2);
		System.out.println(connection3);
		System.out.println(connection4);
<<<<<<< HEAD

	}

=======
		
	}
	
>>>>>>> remotes/zaal/master
}
