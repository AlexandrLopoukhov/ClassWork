package lesson150421.patterns.bus;

public class A extends Member {

	public A(final Bus bus) {
		super(bus);
	}
<<<<<<< HEAD

	public void change() {
		System.out.println("I changed!");
		_bus.broadcast(new ChangedCommand(this));
	}

	@Override
	public void accept(final Command command) {
		System.out.println("message accepted");
	}
=======
	
	public void change() {
		System.out.println("I changed");
		_bus.broadcast(new ChangedCommand(this));
	}

	@Override
	public void accept(final Command command) {
		// ignore
	}

>>>>>>> refs/remotes/zaal/master
}
