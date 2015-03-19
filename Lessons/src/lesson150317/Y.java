package lesson150317;

public class Y extends X {
<<<<<<< HEAD

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
=======
	
	@Override
	public void change() {
		System.out.println("start changeY");
		super.change();
		System.out.println("start changeY");
		super.something();
		this.other();
		something();
		super.something();
		super.something();
	}
	
	public static void main(final String[] args) {
		
		Y y = new Y();
		
		y.change();
		
	}
	
	public void something() {
		System.out.println("something of Y");
	}
	

>>>>>>> remotes/zaal/master
}
