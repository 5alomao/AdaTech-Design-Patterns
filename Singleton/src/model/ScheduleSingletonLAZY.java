package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ScheduleSingletonLAZY {

	private Map<String, Boolean> availableDays = new HashMap<>();

	private static ScheduleSingletonLAZY INSTANCE = null;

	private ScheduleSingletonLAZY() {

		availableDays.put("Monday", Boolean.TRUE);
		availableDays.put("Tuesday", Boolean.TRUE);
		availableDays.put("Wednesday", Boolean.TRUE);
		availableDays.put("Thursday", Boolean.TRUE);
		availableDays.put("Friday", Boolean.TRUE);
		availableDays.put("Saturday", Boolean.TRUE);
		availableDays.put("Sunday", Boolean.TRUE);

	}

	public static ScheduleSingletonLAZY getInstance() {
		if (Objects.isNull(INSTANCE)) {
			INSTANCE = new ScheduleSingletonLAZY();
			return INSTANCE;
		}
		return INSTANCE;
	}

	public Map<String, Boolean> getDays() {
		return availableDays;
	}

	public void unavailableDay(String day) {
		availableDays.replace(day, Boolean.FALSE);
	}

}
