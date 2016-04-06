public class PersonDrive {
	public static void main(String[] args) {
		// Initialize person
		Person person1 = new Person();
		Person person2 = new Person("Sang Nguyen",18);
		
		System.out.println("First person: " + person1.toString());
		System.out.println("Second person: " + person2.toString());

		// Compare
		System.out.println("Object equal? " + samePerson(person1,person2));
		System.out.println("Same name? " + sameName(person1,person2));
		System.out.println("Same age? " + sameAge(person1,person2));
		System.out.println("First person is older? " + olderAge(person1,person2));
		System.out.println("First person is younger? " + youngerAge(person1,person2));
		
	}
	
	public static boolean samePerson(Person person1, Person person2) {
		return (person1.name.equals(person2.name)
			&& person1.age == person2.age)? true:false;
	}
	public static boolean sameName(Person person1, Person person2) {
		return (person1.name.equals(person2.name));
	}

	public static boolean sameAge(Person person1, Person person2) {
		return (person1.age == person2.age)? true:false;
	}
	
	public static boolean olderAge(Person person1, Person person2) {
		return (person1.age > person2.age)? true:false;
	}
	
	public static boolean youngerAge(Person person1, Person person2) {
		return (person1.age < person2.age)? true:false;
	}
	
}