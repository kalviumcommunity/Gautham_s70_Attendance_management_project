public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }
        students[0].setDetails(1, "Alice");
        students[1].setDetails(2, "Bob");

        System.out.println("Student Details:");
        for (Student s : students) {
            s.displayDetails();
            System.out.println();
        }
        Course[] courses = new Course[2];
        for (int i = 0; i < courses.length; i++) {
            courses[i] = new Course();
        }
        courses[0].setDetails(101, "Mathematics");
        courses[1].setDetails(102, "Science");

        System.out.println("Course Details:");
        for (Course c : courses) {
            c.displayDetails();
            System.out.println();
        }
    }
}
