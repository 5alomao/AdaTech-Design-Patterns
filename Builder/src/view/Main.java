package view;

import model.People;

public class Main {

	public static void main(String[] args) {

		People objPeople = new People.PeopleBuilder().name("Salomão").surname("Ferreira Junior").birth("15/07/2003")
				.email("salomao2k22@gmail.com").createPeople();

		System.out.println(objPeople);
	}

}
