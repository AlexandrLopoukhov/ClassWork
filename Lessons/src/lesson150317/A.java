package lesson150317;

public class A {

	protected int state;

	public void change() {
		System.out.println("Change of A");
		state++;
	}

	public int get() {
		return state;
	}

}
