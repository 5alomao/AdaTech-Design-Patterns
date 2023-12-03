package model;

public class People {

	private String name, surname, birth, email;

	private People(String name, String surname, String birth, String email) {
		this.name = name;
		this.surname = surname;
		this.birth = birth;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {

		return "Nome: " + name + "\nSobrenome: " + surname + "\nData de Nascimento: " + birth + "\nEmail: " + email;
	}

	public static class PeopleBuilder {

		private String name, surname, birth, email;

		public PeopleBuilder name(String name) {
			this.name = name;
			return this;
		}

		public PeopleBuilder surname(String surname) {
			this.surname = surname;
			return this;
		}

		public PeopleBuilder birth(String birth) {
			this.birth = birth;
			return this;
		}

		public PeopleBuilder email(String email) {
			this.email = email;
			return this;
		}

		public People build() {
			return new People(name, surname, birth, email);
		}

	}

}
