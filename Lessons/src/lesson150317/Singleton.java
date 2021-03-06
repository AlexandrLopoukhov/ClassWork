package lesson150317;

public class Singleton {

	// public final static Singleton instance = new Singleton();
	private static Singleton instance = new Singleton();

	private Singleton() {
		System.out.println("Create new instance");
	}

	public static Singleton instance() {
		return instance;
	}

	public static Singleton singleton() {
		return instance;
	}

	public static Singleton get() {
		// TODO Auto-generated method stub
		return instance;
	}

}
