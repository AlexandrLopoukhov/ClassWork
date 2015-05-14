package lesson150421.patterns.bus;

public class B extends Member {

	public B(final Bus bus) {
		super(bus);
	}

	@Override
	public void accept(final Command command) {
<<<<<<< HEAD
		System.out.println("B received " + command);
=======
		System.out.println("I have received " + command);
>>>>>>> refs/remotes/zaal/master
	}

}
