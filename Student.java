public class Student {
    private String firstName;
	private String lastName;

    public Student(String fName, String lName) {
        firstName = fName;
		lastName = lName;
    }

    public String getFirstName() {
        return firstName;
    } 
		
	public String getLastName() {
		return lastName;
	} 
    public String toString() {
        return "Your name is " + firstName + lastName; 
    }
}
