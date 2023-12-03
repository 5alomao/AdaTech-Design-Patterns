package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

public class PeopleRepositoryProxy extends PeopleRepository {

	public static Logger log = Logger.getLogger(PeopleRepositoryProxy.class.getName());

	private Map<Long, People> cache = new HashMap<>();

	@Override
	public void save(People objPeople) {
		log.info("Iniciando chamada do método save ...");
		super.save(objPeople);
		log.info("Chamada do método save finalizada.");
	}

	@Override
	public People findById(Long id) {
		log.info("Iniciando chamada do método findById ...");

		long start = System.currentTimeMillis();
		People objPeople = null;

		if (Objects.nonNull(cache.get(id))) {
			log.info("Pegando dados do cache ...");
			objPeople = cache.get(id);
		} else {
			log.info("Pegando dados de PeopleRepository ...");
			objPeople = super.findById(id);
			cache.put(id, objPeople);
		}

		log.info("Chamada do método findById finalizada.");

		long end = System.currentTimeMillis();

		log.info("Tempo gasto na chamada: " + (end - start));

		return objPeople;
	}
}
