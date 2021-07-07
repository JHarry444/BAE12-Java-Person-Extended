package extended.person;

import java.util.ArrayList;

import extended.pets.Pet;

public class Person {

	// Attributes - what it has
	private String name;

	private int age;

	private String jobTitle;

	private ArrayList<Pet> pets = new ArrayList<>();

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

	public void addPet(Pet pet) {
		this.pets.add(pet);
	}

	public void removePet(Pet pet) {
		this.pets.remove(pet);
	}

//	public void print() {
//		System.out.println("Name: ");
//		System.out.println(this.name);
//		System.out.println("Age: ");
//		System.out.println(this.age);
//		System.out.println("Job Title: ");
//		System.out.println(this.jobTitle);
//		System.out.println("Pets: [");
//		for (Pet pet : this.pets) {
//			pet.print();
//		}
//		System.out.println("]");
//	}

	@Override
	public String toString() {
		return "Person [name=" + name + ",\n age=" + age + ",\n jobTitle=" + jobTitle + ",\n pets=" + pets + "]";
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

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public ArrayList<Pet> getPets() {
		return pets;
	}

	public void setPets(ArrayList<Pet> pets) {
		this.pets = pets;
	}

}
