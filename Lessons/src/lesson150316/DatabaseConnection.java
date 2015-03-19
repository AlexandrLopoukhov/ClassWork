package lesson150316;

public class DatabaseConnection {

	private static final int MAX_CONNECTIONS = 3;
	private static int Counter;
<<<<<<< HEAD

	public static DatabaseConnection create() {
		if (Counter >= 3) {
			return null;
		} else {
			return new DatabaseConnection();
		}
	}

	public static void free() {
		Counter--;

	}

	{
		Counter++;
	}

	private DatabaseConnection() {
	}

	public static void main(final String[] args) {
		// TODO Auto-generated method stub

	}

=======
	
	public static DatabaseConnection create() {
		if (Counter >= 3) {
			return null;
		}
		return new DatabaseConnection();
	}
	
	{
		Counter++;
	}
	
	private DatabaseConnection() {
	}
	
	static public void freeAny() {
		Counter--;
	}
	
	public void free() {
		Counter--;
	}
	
	
	
>>>>>>> remotes/zaal/master
}
