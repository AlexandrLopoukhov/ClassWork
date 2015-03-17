package lesson150317;

public class E {

	int stateE = 10;

	{
		System.out.println("Init E");
	}

	public E() {
		super();
		System.out.println("Constructor E");
	}

	public E(final int a) {
		super();
		System.out.println("Constructor E with parametr");
	}

}
