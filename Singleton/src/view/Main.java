package view;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import model.ScheduleSingletonENUM;
import model.ScheduleSingletonLAZY;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		reserveDayEAGER("Friday");
		reserveDayEAGER("Saturday");

		reserveDayLAZY("Monday");
		reserveDayLAZY("Sunday");

		reserveDayENUM("Thursday");
		reserveDayENUM("Wednesday");

		Constructor<ScheduleSingletonENUM> evilConstructor = ScheduleSingletonENUM.class.getDeclaredConstructor();
		evilConstructor.setAccessible(true);
		ScheduleSingletonENUM agendatravessa = evilConstructor.newInstance();
		System.out.println(agendatravessa.hashCode());

	}

	public static void reserveDayEAGER(String day) {

		ScheduleSingletonENUM objSchedule = ScheduleSingletonENUM.getInstance();
		objSchedule.unavailableDay(day);
		System.out.println(objSchedule.getDays());

	}

	public static void reserveDayLAZY(String day) {

		ScheduleSingletonLAZY objSchedule = ScheduleSingletonLAZY.getInstance();
		objSchedule.unavailableDay(day);
		System.out.println(objSchedule.getDays());

	}

	public static void reserveDayENUM(String day) {

		ScheduleSingletonENUM objSchedule = ScheduleSingletonENUM.getInstance();
		objSchedule.unavailableDay(day);
		System.out.println(objSchedule.getDays());

	}
}
