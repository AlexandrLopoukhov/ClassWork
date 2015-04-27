package lesson150421.patterns.observer;

public class Termometer {
	private static final int MAX_TEMP = 3;
	int currentTempurature;
	private FirePreventionSystem _system;

	public Termometer(final FirePreventionSystem sys) {
		_system = sys;
	}

	public void increase() {
		currentTempurature++;
		if (currentTempurature > MAX_TEMP) {
			_system.turnsSignalOn();
		}
	}

	public void decrease() {
		currentTempurature--;
	}
}
