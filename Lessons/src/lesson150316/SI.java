package lesson150316;

public class SI {

	public void changeState() {

	}

	public SI() {

	}

	static int x;

	static {
		x = 10;
		System.out.println("static init: " + x);
	}
	static {
		x = 20;
		System.out.println("static init: " + x);
	}

	static void test() {
		System.out.println("this is test");
	}

}
