package extended.person;

import extended.pets.Pet;

public class Snake extends Pet {

	public Snake(String name, int age, String colour) {
		super(name, age, colour);
	}

	@Override
	public void speak() {
		System.out.println("hisssssss");
	}
}
