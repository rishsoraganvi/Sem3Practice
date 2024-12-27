import java.util.Scanner;

class Student {
    private String name;
    private String usn;
    private String section;
    private int roll;
    private String grade;

    // Constructor
    public Student(String name, String usn, String section, int roll, String grade) {
        this.name = name;
        this.usn = usn;
        this.section = section;
        this.roll = roll;
        this.grade = grade;
    }

    // Override toString method to display student information
    @Override       
    public String toString() {
        return "Name: " + name + ", USN: " + usn + ", Section: " + section + 
               ", Roll No: " + roll + ", Grade: " + grade;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int size = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()

        Student[] studentsArray = new Student[size]; // Correctly initialize the array

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the name of the student: ");
            String name = sc.nextLine();
            System.out.println("Enter the USN of the student: ");
            String usn = sc.nextLine();
            System.out.println("Enter the Section of the student: ");
            String section = sc.nextLine();
            System.out.println("Enter the roll no. of the student: ");
            int roll = sc.nextInt();
            sc.nextLine(); 
            System.out.println("Enter the grade of the student: ");
            String grade = sc.nextLine();

            // Create a new Student object and store it in the array
            studentsArray[i] = new Student(name, usn, section, roll, grade);
        }

        System.out.println("\nStudent Information:");
        for (Student student : studentsArray) {
            System.out.println(student); // This will call the toString method
        }

        sc.close();
    }
}
