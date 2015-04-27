package lesson150421.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class UniversalTermometer {
	List<TermometerListener> list = new ArrayList<TermometerListener>();

	public void addListener(final TermometerListener listener) {
		list.add(listener);
	}

	public void removeListener(final TermometerListener listener) {
		list.remove(listener);
	}

	int _currentTemperature;

	public void increase() {
		_currentTemperature++;
		fireTemperatureChangedEvent();
	}

	private void fireTemperatureChangedEvent() {
		for (TermometerListener termometerListener : list) {
			termometerListener.currentTemperature(_currentTemperature);
		}
	}

	public void decrease() {
		_currentTemperature--;
	}
}
