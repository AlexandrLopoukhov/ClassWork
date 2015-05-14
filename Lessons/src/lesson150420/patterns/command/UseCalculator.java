package lesson150420.patterns.command;

<<<<<<< HEAD
import java.util.*;

import lesson150420.patterns.command.Calculator.Command;
import lesson150420.patterns.command.Calculator.Plus;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class UseCalculator {
	public static void main(final String[] args) {
		Calculator calc = new Calculator();
		final java.util.List<Command> list = Arrays.asList(calc.new Plus(3),
				calc.new Minus(4), calc.new Clear());

	}
=======
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import lesson150420.patterns.command.Calculator.Command;

public class UseCalculator {

	public static void main(final String[] args) {
		System.out.println("start");

		Calculator calc = new Calculator();

		final List<Calculator.Command> list = Arrays.asList(calc.new Plus(10),
				calc.new Minus(20), calc.new Get(), calc.new Clear(),
				calc.new Get());

		Collections.reverse(list);

		
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (Command command : list) {
					command.execute();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		}).start();
		System.out.println("finish");

	}

>>>>>>> refs/remotes/zaal/master
}
