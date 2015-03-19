package lesson150317;

<<<<<<< HEAD
public class LazyA {

	int state;

	public void change() {
		state++;
	}

=======
public class LazyA {  // Liskov Substituion Principle  is broken
	
	int state;
	
	public void change() {
		state += 2;
	}
	
>>>>>>> remotes/zaal/master
	public int get() {
		return state;
	}

}
