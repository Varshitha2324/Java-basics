public class Variables {
    int rollNo; // instance variable
    static String college; // static variable

    public static void main(String[] args) {
        // Assign value to static variable
        Student.college = "ABC University";

        // Create two objects
        Student s1 = new Student();
        Student s2 = new Student();

        // Assign values to instance variables
        s1.rollNo = 101;
        s2.rollNo = 102;

        // Print values
        System.out.println("Student 1:");
        System.out.println("Roll No: " + s1.rollNo);
        System.out.println("College: " + s1.college);

        System.out.println("\nStudent 2:");
        System.out.println("Roll No: " + s2.rollNo);
        System.out.println("College: " + s2.college);
    }
}
