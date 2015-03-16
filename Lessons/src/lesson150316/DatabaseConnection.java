package lesson150316;

public class DatabaseConnection {

	private static final int MAX_CONNECTIONS = 3;
	private static int Counter;

	public static DatabaseConnection create() {
		if (Counter >= 3) {
			return null;
		} else {
			return new DatabaseConnection();
		}
	}

	public void free() {
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

}
