package extended;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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

		Person found = manager.findByName("JH");

		if (found != null) {
			System.out.println(found);
		} else {
			System.out.println("Trainer doesn't exist with that name");
		}

		String foundAsString = String.valueOf(found);

		System.out.println(foundAsString);

		Dog dog1 = new Dog("Brutus", 6, "Black");
		Dog dog2 = new Dog("Brutus", 6, "Black");

		System.out.println(dog1 == dog2);
		System.out.println(dog1.equals(dog2));

		System.out.println("abc".equals("abc"));

		System.out.println(new String("abc") == new String("abc"));

		Pet p = new Dog("Barry", 12, "Blonde");

		p.speak();

		((Dog) p).fetch();

		List<String> words = new ArrayList<>();

		Set<Pet> pets = new HashSet<>();
		pets.add(new Dog("Fido", 12, "Brindle"));
		pets.add(new Dog("Fido", 12, "Brindle"));

		System.out.println("SET OF PETS:");
		System.out.println(pets);

		for (Pet pet : pets) {
			if ("Fido".equals(pet.getName())) {
				System.out.println("FOUND IT: " + pet);
			}
		}

		System.out.println("IT'S MAP TIME");
		Map<Integer, Pet> petMap = new HashMap<>();

		petMap.put(27, new Dog("Rex", 6, "Brown"));
		petMap.put(27, new Dog("Fido", 12, "Brindle"));
		petMap.putIfAbsent(27, new Cat(null, 0, null));

		System.out.println(petMap);

		Map<String, Pet> petMap2 = new HashMap<>();

		petMap2.put("Dog1", new Dog("Rex", 6, "Brown"));
		petMap2.put("Dog2", new Dog("Fido", 12, "Brindle"));

		System.out.println("KEYS: " + petMap2.keySet());
		System.out.println("ENTRIES: " + petMap2.entrySet());

		System.out.println("ITERATE THROUGH KEYSET:");
		for (String key : petMap2.keySet()) {
			System.out.println("KEY: " + key + " VALUE: " + petMap2.get(key));
		}
		System.out.println("ITERATE THROUGH ENTRYSET:");
		for (Entry<String, Pet> petEntry : petMap2.entrySet()) {
			System.out.println("KEY: " + petEntry.getKey() + " VALUE: " + petEntry.getValue());
		}

		System.out.println("ITERATE THROUGH VALUES:");

		for (Pet petValue : petMap2.values()) {
			System.out.println("VALUE: " + petValue);
		}
		petMap2.remove("Dog1");

		System.out.println(petMap2);
	}

}
