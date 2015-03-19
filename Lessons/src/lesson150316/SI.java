package lesson150316;

public class SI {

	public void changeState() {
<<<<<<< HEAD

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

=======
		
	}
	
	static {
		System.out.println("init 1");
	}
	
	static int x;
	
	static {
		System.out.println("init 2");
	}
	
	public SI() {
	}
	
>>>>>>> remotes/zaal/master
	static void test() {
		System.out.println("this is test");
	}

<<<<<<< HEAD
=======
	static {
		System.out.println("init 3");
		x = 10;
		
		System.out.println("static init: " + x);
		
	}
	
>>>>>>> remotes/zaal/master
}
