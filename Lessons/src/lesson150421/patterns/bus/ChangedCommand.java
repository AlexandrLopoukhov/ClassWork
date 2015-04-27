package lesson150421.patterns.bus;

public class ChangedCommand implements Command {

	private Member _member;

	@Override
	public void execute() {
		System.out.println("this");
	}

	public ChangedCommand(final Member member) {
		_member = member;
	}

}
