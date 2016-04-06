
public class Person {
	String name;
	int age;
	
	public Person() {
		name = "John Doe";
		age = 25;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String toString() {
		return this.name + " " + this.age;
	}
}
