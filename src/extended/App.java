package extended;

import extended.person.Person;
import extended.person.PersonManager;
import extended.person.Snake;
import extended.pets.Cat;
import extended.pets.Dog;
import extended.pets.Pet;

public class App {

	// polymorphism -> one thing can take many forms
	// overloading and overriding

	public static void main(String[] args) {

//		Pet p = new Pet(); -> doesn't work cus abstract

		PersonManager manager = new PersonManager();

		Person p1 = new Person("JH", 27, "Trainer");
		p1.addPet(new Dog("Rex", 12, "Black"));
		p1.addPet(new Cat("Fluffy", 6, "White"));
		p1.addPet(new Snake("Slither", 5, "Red"));
		manager.addPerson(p1);

//		manager.print();

		for (Pet pet : p1.getPets()) {
			pet.speak();
		}

		Person found = manager.findByName("Barry");

		if (found != null) {
			found.print();
		} else {
			System.out.println("Trainer doesn't exist with that name");
		}
	}

}
