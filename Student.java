public class Student {
    private String firstName;

    public Student(String fName) {
        firstName = fName;
    }

    public String getName() {
        return firstName;
    } 
		
    public String toString() {
        return "Your name is " + firstName; 
    }
}
