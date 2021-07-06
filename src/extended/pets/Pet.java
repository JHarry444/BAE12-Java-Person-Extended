package extended.pets;

public abstract class Pet {

	private String name;

	private int age;

	private String colour;

	// INSERT INTO `pet` (`name`, `age`, `colour`) VALUES (...);
	public Pet(String name, int age, String colour) {
		this.setName(name);
		this.setAge(age);
		this.setColour(colour);
	}

	// ^ overloaded constructor v

	// INSERT INTO `cat` () VALUES ();
	public Pet() {
		// Default constructor
	}

	public void print() {
		System.out.println("Name: ");
		System.out.println(this.name);
		System.out.println("Age: ");
		System.out.println(this.age);
		System.out.println("Colour: ");
		System.out.println(this.colour);
	}

	// All pets CAN speak
	// but there's no baseline/default
	// works cuz abstract class
	public abstract void speak();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
