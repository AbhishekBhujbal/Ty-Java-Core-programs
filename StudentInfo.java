package Student;
import java.io.IOException;
import java.util.Scanner;
public class StudentInfo {
    int rollno;
    String name, grade;
    public float gt, tyt, syt;
    public float per;

    public void get() throws IOException {
        System.out.println("Enter roll number and name of the student: ");
        Scanner sc = new Scanner(System.in);
        
        // Assign to instance variables directly
        rollno = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline character
        name = sc.nextLine(); // Get the full name
    }
}

