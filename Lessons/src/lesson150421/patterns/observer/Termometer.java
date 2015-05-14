package lesson150421.patterns.observer;

public class Termometer {
<<<<<<< HEAD
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
=======
	
	private static final int MAX_TEMP = 3;
	int currentTemperature;
	private FirePreventionSystem _system;
	
	public Termometer(final FirePreventionSystem system) {
		_system = system;
	}
	
	public void increase() {
		currentTemperature++;
		if (currentTemperature > MAX_TEMP) {
			_system.turnSignalOn();
		}
	}
	
	public void descrease() {
		currentTemperature--;
	}

>>>>>>> refs/remotes/zaal/master
}
