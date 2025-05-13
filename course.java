import java.util.HashMap;
import java.util.Map;

class course {

    private Map<String, Integer> course;

    // Constructor to initialize the courses map
    public course() {
        course = new HashMap<>();
    }

    // Method to add courses and marks
    public void addCourse(String courseName, int marksObtained) {
        course.put(courseName, marksObtained);
    }

    // Method to display courses and marks
    public void displayCoursesAndMarks() {
        System.out.println("\nCourses and Marks Obtained:");
        for (Map.Entry<String, Integer> entry : course.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // Hardcoded course information
        course studentCourses = new course();
        studentCourses.addCourse("Mathematics", 85);
        studentCourses.addCourse("Physics", 78);
        studentCourses.addCourse("Computer Science", 90);

        studentCourses.displayCoursesAndMarks();
    }
}



