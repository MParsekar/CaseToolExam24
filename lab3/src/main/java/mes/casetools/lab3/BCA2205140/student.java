package mes.casetools.lab3.BCA2205140;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    // Display method
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

public class student {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get student details from the user
        System.out.println("Enter student details:");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Roll Number: ");
        int rollNumber = scanner.nextInt();

        System.out.print("Marks: ");
        double marks = scanner.nextDouble();

        // Create a Student object with the provided details
        Student student = new Student(name, rollNumber, marks);

        // Display student details
        System.out.println("\nStudent Details:");
        student.displayDetails();

        // Close the scanner
        scanner.close();
    }
}
