package lesson150420.patterns.command;

import sun.print.resources.serviceui;

public class Example {
	abstract static class Command {
		Calculator _service;

		public Command(final Calculator service) {
			_service = service;
			// TODO Auto-generated constructor stub
		}

		public abstract void execute();
	}

	static class Do2Command extends Command {

		public Do2Command(final Calculator service) {
			super(service);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void execute() {
			// TODO Auto-generated method stub
			// _service.plus(3);
		}
	}

	public static void main(final String[] args) {
		System.out.println("start");
		Calculator service = new Calculator();
		// service.clear();
		// service.plus(2);
		// service.minus(2);
		System.out.println("finish");
		Command command = new Do2Command(service);
	}
}
