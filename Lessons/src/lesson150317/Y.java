package lesson150317;

public class Y extends X {

	@Override
	public void change() {
		super.change();
		other();
		System.out.println("change from Y");
		super.something();
	}

	public static void main(final String[] args) {
		new Y().change();
	}

	public void something() {
		System.out.println("something Y");
	}

}
