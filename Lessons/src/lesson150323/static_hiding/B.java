package lesson150323.static_hiding;

public class B extends A {
<<<<<<< HEAD
	public static int getCount() {
		System.out.println("B");
		return 0;
	}
=======
	
//	static int count;
	
	public static int getCount() {
		System.out.println("from B");
		return 0;
	}

>>>>>>> refs/remotes/zaal/master
}
