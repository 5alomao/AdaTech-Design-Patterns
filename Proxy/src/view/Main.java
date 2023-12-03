package view;

import model.People;
import model.PeopleRepositoryProxy;
import model.PeopleService;

public class Main {

	public static void main(String[] args) {

		PeopleService peopleService = new PeopleService(new PeopleRepositoryProxy());

		People objPeople = new People.PeopleBuilder().name("Salomão").surname("Ferreira Junior").birth("15/07/2003")
				.email("salomao.junior2k22@gmail.com").build();

		peopleService.save(objPeople);

		People people = peopleService.findById(1L);

		System.out.println(people);

		People people2 = peopleService.findById(1L);

		System.out.println(people2);
	}
}
