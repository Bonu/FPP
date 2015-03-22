package edu.mum.mscs.fpp.homework.w1d4;

/**
 * 
 * Complete the given skeleton and Implement main class to perform the operations for PersonArrayOpe class.
 * 
 * output:
 * 
 *  Person [firstName=Janak, lastName=Rosh, age=32]
	Person [firstName=Rama, lastName=Shah, age=43]
	Person [firstName=Surya, lastName=Iyer, age=23]
	Person [firstName=Sita, lastName=Ray, age=21]
	Person [firstName=Rocky, lastName=Martin, age=27]
	Person [firstName=Sandhya, lastName=Royal, age=33]
	Person [firstName=Bharath, lastName=Sena, age=36]
	Person [firstName=Jeeva, lastName=Mani, age=31]
	Person [firstName=Chiru, lastName=Sadhava, age=24]
	Employee Mr.Iyer is Deleted Successfully
	Person [firstName=Janak, lastName=Rosh, age=32]
	Person [firstName=Rama, lastName=Shah, age=43]
	Person [firstName=Sita, lastName=Ray, age=21]
	Person [firstName=Rocky, lastName=Martin, age=27]
	Person [firstName=Sandhya, lastName=Royal, age=33]
	Person [firstName=Bharath, lastName=Sena, age=36]
	Person [firstName=Jeeva, lastName=Mani, age=31]
	Person [firstName=Chiru, lastName=Sadhava, age=24]
	Employee Mr.Rao is NOT Deleted, not found in employee directory
 * 
 * @author janardhanbonu
 *
 */
public class PeopleManager {

	public static void main(String[] args){
		
		PersonArrayOpe pao = new PersonArrayOpe(10);
		
		pao.insert("Janak", "Rosh", 32);
		pao.insert("Rama", "Shah", 43);
		pao.insert("Surya", "Iyer", 23);
		pao.insert("Sita", "Ray", 21);
		pao.insert("Rocky", "Martin", 27);
		pao.insert("Sandhya", "Royal", 33);
		pao.insert("Bharath", "Sena", 36);
		pao.insert("Jeeva", "Mani", 31);
		pao.insert("Chiru", "Sadhava", 24);
		
		pao.displayAll();
		
		System.out.printf("Employee Mr.Iyer is %s\n",pao.delete("Iyer")?"Deleted Successfully":"NOT Deleted");
		
		pao.displayAll();
		
		System.out.printf("Employee Mr.Rao is %s\n",pao.delete("Rao")?"Deleted Successfully":"NOT Deleted, not found in employee directory");
		
	}
}

class Person {
	private String lastName;
	private String firstName;
	private int age;

	public Person(String firstName, String lastName, int age) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}

	public void displayPerson() {
		// Display fisrtName, lastName and age
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + "]";
	}

	public String getLastName(){
		// get only the last name
		return lastName;
	}
	
} // end class Person

class PersonArrayOpe {
	
	private Person[] persons; // reference to array
	private int nElems; // number of data items

	public PersonArrayOpe(int max){
		// constructor to initialize person array with size max and nElems;
		persons = new Person[max];
		nElems = 0;
	}

	public Person find(String lastName) {
		// Pass Lastname as an argument
		for (Person person : persons) {
			if(lastName.equalsIgnoreCase(person.getLastName())){
				return person;
			} else {
				System.err.printf("Failed to find the person %s",lastName);
			}
		}
		return null;
	}

	public void insert(String lastName, String firstName, int age) {
		// Insert at last
		persons[nElems] = new Person(lastName, firstName, age);
		nElems ++;
	}

	public boolean delete(String lastName) {
		// Shift down the elements. Argument should be lastname
		for (int i = 0; i < nElems; i++) {
			Person person = persons[i];
			if(lastName.equalsIgnoreCase(person.getLastName())){
				for (int j = i; j < nElems-1; j++) {
					persons[j]= persons[j+1];
				}
				nElems--;
				return true;
			}
		}
		return false;
	}

	public void displayAll() // displays array contents
	{
		for (int i = 0; i < nElems; i++) {
			persons[i].displayPerson();
		}
	}

	public int size() // Return the number of persons stored in the array
	{
		return nElems;
	}
}
