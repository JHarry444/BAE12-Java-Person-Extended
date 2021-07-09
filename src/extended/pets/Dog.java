package extended.pets;

public class Dog extends Pet {

	public Dog(String name, int age, String colour) {
		super(name, age, colour);
	}

	@Override
	public void speak() {
		System.out.println("Woof");
	}

	public void fetch() {
		System.out.println("Stop trying to make fetch happen");
	}
}
