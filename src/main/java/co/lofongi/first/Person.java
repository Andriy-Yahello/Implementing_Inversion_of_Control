package co.lofongi.first;

public class Person {
	private String firstname;
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	private String lastName;
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastName=" + lastName + "]";
	}
	
}
