package lesson150421.patterns.bus;

public abstract class Member {
<<<<<<< HEAD
	protected Bus _bus;

	public Member(final Bus bus) {
		_bus = bus;
		bus._members.add(this);
	}

	public abstract void accept(Command command);

=======

	protected Bus _bus;

	public Member(final Bus bus) {
		_bus = bus;
		_bus.addMember(this);
	}
	
	public abstract void accept(Command command);
	
>>>>>>> refs/remotes/zaal/master
}
