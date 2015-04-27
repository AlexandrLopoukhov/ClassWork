package lesson150420.patterns.command;

public class Calculator {

	abstract class Command {
		public void execute() {
			realExecute();
			System.out.println(total);
		}

		abstract void realExecute();
	}

	public class Plus extends Command {
		private int _value;

		Plus(final int value) {
			_value = value;
		}

		@Override
		void realExecute() {
			// TODO Auto-generated method stub
			total += _value;
		}
	}

	public class Minus extends Plus {

		Minus(final int value) {
			super(-value);
			// TODO Auto-generated constructor stub
		}
	}

	public class Clear extends Command {

		@Override
		void realExecute() {
			total = 0;
		}
	}

	public class Get extends Command {

		@Override
		void realExecute() {
			System.out.println(total);
		}
	}

	int total = 0;

}
