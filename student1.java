import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class student1 {

    private String name;
    private LocalDate dateOfBirth;

    // Constructor to initialize name and dateOfBirth
    public student1(String name, String dateOfBirth) {
        this.name = name;
        // Parse the dateOfBirth string into LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.dateOfBirth = LocalDate.parse(dateOfBirth, formatter);
    }

    // Method to display student information
    public void displayStudentInfo() {
        // Calculate the age based on dateOfBirth
        LocalDate today = LocalDate.now();
        Period period = Period.between(dateOfBirth, today);
        int age = period.getYears();

        System.out.println("Student Name: " + name);
        System.out.println("Age of Student: " + age);
    }

    public static void main(String[] args) {
        // Hardcoded student information
        student1 student = new student1("John Doe", "15-08-2000");
        student.displayStudentInfo();
    }
}

