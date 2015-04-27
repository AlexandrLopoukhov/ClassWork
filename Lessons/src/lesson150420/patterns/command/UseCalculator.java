package lesson150420.patterns.command;

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
}
