package model;

public class PeopleService {

	private PeopleRepositoryProxy peopleRepositoryProxy;

	public PeopleService(PeopleRepositoryProxy peopleRepositoryProxy) {
		this.peopleRepositoryProxy = peopleRepositoryProxy;
	}

	public void save(People objPeople) {
		peopleRepositoryProxy.save(objPeople);
	}

	public People findById(Long id) {
		return peopleRepositoryProxy.findById(id);
	}
}
