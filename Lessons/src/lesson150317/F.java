package lesson150317;

public class F extends E {

	int stateF = 20;
<<<<<<< HEAD

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
=======
	
	{
		System.out.println("Init F");
		System.out.println(stateE + ", " + stateF);
	}
	
	public F() {
		super(30);
		System.out.println("Construct F");
	}
	
	
	public static void main(final String[] args) {
		
		F f = new F();
		
	}
	
}


>>>>>>> remotes/zaal/master