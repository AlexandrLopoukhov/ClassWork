package lesson150317;

public class A {
<<<<<<< HEAD

	protected int state;

	public void change() {
		System.out.println("Change of A");
		state++;
	}

=======
	
//	protected int state;
	int state;
	
	public void change() {
		System.out.println("change of A");
		state++;
	}
	
>>>>>>> remotes/zaal/master
	public int get() {
		return state;
	}

}
