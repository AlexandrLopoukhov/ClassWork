package lesson150317;

public class F extends E {

	int stateF = 20;

	{
		System.out.println("Init F");
		System.out.println(stateE + " ," + stateF);
	}

	public F() {
		super(10);
		System.out.println("Constructor F");
	}

	public static void main(final String[] args) {

		F f = new F();
	}

}
