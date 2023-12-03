package model;

import java.util.HashMap;
import java.util.Map;

public class PeopleRepository {

	private Map<Long, People> data = new HashMap<>();

	private static Long countId = 1L;

	public void save(People objPeople) {
		data.put(countId++, objPeople);
	}

	public People findById(Long id) {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		return data.get(id);
	}

}
