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

//	public void print() {
//		System.out.println("Name: ");
//		System.out.println(this.name);
//		System.out.println("Age: ");
//		System.out.println(this.age);
//		System.out.println("Colour: ");
//		System.out.println(this.colour);
//	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + ", colour=" + colour + "]";
	}

	// All pets CAN speak
	// but there's no baseline/default
	// works cuz abstract class
	public abstract void speak();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		if (age != other.age)
			return false;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

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
