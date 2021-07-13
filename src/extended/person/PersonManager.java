package extended.person;

import java.util.ArrayList;

public class PersonManager {

	private ArrayList<Person> people = new ArrayList<>();

	public void addPerson(Person person) {
		this.people.add(person);
	}

	public void removePerson(Person person) {
		this.people.remove(person);
	}

	public Person findByName(String name) {
		for (Person person : this.people) {
			if (person.getName() == name) {
				return person;
			}
		}
		throw new PersonNotFoundException("No person called " + name + " found in the list.");
	}

	@Override
	public String toString() {
		return "PersonManager [people=" + people + "]";
	}

}
