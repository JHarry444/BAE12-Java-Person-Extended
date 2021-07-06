package extended.person;

import java.util.ArrayList;

import extended.pets.Cat;
import extended.pets.Dog;

public class Person {

	// Attributes - what it has
	public String name;

	public int age;

	public String jobTitle;

	public ArrayList<Cat> cats = new ArrayList<>();

	public ArrayList<Dog> dogs = new ArrayList<>();

	public Person(String name, int age, String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public Person() {
		// Default constructor
	}

	// Behaviours - What it does

	public void addCat(Cat cat) {
		this.cats.add(cat);
	}

	// BAD - breaks if we change the Cat constructor
	public void addCat(String name, int age, String colour) {
		this.cats.add(new Cat(name, age, colour));
	}

	public void removeCat(Cat cat) {
		this.cats.remove(cat);
	}

	public void addDog(Dog dog) {
		this.dogs.add(dog);
	}

	public void removeDog(Dog dog) {
		this.dogs.remove(dog);
	}

	public void print() {
		System.out.println("Name: ");
		System.out.println(this.name);
		System.out.println("Age: ");
		System.out.println(this.age);
		System.out.println("Job Title: ");
		System.out.println(this.jobTitle);

		System.out.println("Cats: [");
		for (Cat cat : this.cats) {
			cat.print();
		}
		System.out.println("]");

		System.out.println("Dogs: [");
		for (Dog dog : this.dogs) {
			dog.print();
		}
		System.out.println("]");
	}

}
