package lesson150317;

public class E {

	int stateE = 10;
<<<<<<< HEAD

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

=======
	
	{
		System.out.println("Init E");
	}
	
//	public E() {
//		super();
//		System.out.println("Construct E");
//	}
	
	public E(final int initialState) {
		stateE = initialState;
		System.out.println("Construct E with parameter");
	}
	
	
	
>>>>>>> remotes/zaal/master
}
