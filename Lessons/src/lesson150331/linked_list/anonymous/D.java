package lesson150331.linked_list.anonymous;

public abstract class D {
	String state = "Hello!";

	public static D createUpper() {
		return new D() {

			@Override
			public void doSomething() {
				System.out.println(state.toUpperCase());
			}
		};
	}

	public abstract void doSomething();
}
