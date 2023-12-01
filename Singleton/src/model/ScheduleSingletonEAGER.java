package model;

import java.util.HashMap;
import java.util.Map;

public class ScheduleSingletonEAGER {

	private Map<String, Boolean> availableDays = new HashMap<>();

	private static final ScheduleSingletonEAGER INSTANCE = new ScheduleSingletonEAGER();

	private ScheduleSingletonEAGER() {

		availableDays.put("Monday", Boolean.TRUE);
		availableDays.put("Tuesday", Boolean.TRUE);
		availableDays.put("Wednesday", Boolean.TRUE);
		availableDays.put("Thursday", Boolean.TRUE);
		availableDays.put("Friday", Boolean.TRUE);
		availableDays.put("Saturday", Boolean.TRUE);
		availableDays.put("Sunday", Boolean.TRUE);

	}

	public static ScheduleSingletonEAGER getInstance() {
		return INSTANCE;
	}

	public Map<String, Boolean> getDays() {
		return availableDays;
	}

	public void unavailableDay(String day) {
		availableDays.replace(day, Boolean.FALSE);
	}

}
