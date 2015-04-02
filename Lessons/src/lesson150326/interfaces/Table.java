package lesson150326.interfaces;

public abstract class Table extends Furniture {

<<<<<<< HEAD
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("move table");
	}

	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("clean table");
=======
	@Override
	public void move() {
		System.out.println("moving table");
	}

	@Override
	public void clean() {
		System.out.println("cleaning table");
>>>>>>> refs/remotes/zaal/master
	}

}
