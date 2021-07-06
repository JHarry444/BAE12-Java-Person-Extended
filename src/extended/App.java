package extended;

import extended.person.Person;
import extended.person.PersonManager;
import extended.pets.Dog;

public class App {

	public static void main(String[] args) {

		PersonManager manager = new PersonManager();

		Person p1 = new Person("JH", 27, "Trainer");
		p1.addDog(new Dog("Rex", 12, "Black"));
		manager.addPerson(p1);

		manager.print();

		Person found = manager.findByName("Barry");

		if (found != null) {
			found.print();
		} else {
			System.out.println("Trainer doesn't exist with that name");
		}
	}

}
