import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Student {
    int rollno;
    String name;
    float per;
    static int count = 0;

    // Default constructor
    Student() {}

    // Parameterized constructor
    Student(int rollno, String name, float per) {
        this.rollno = rollno;
        this.name = name;
        this.per = per;
        count++;
    }

    // Method to display student details
    void display() {
        System.out.println(rollno + "\t" + name + "\t" + per);		
    }

    // Getter for percentage
    float getper() {
        return per;
    }

    // Static method to display the count of created objects
    static void counter() {
        System.out.println(count + " Object(s) created");
    }

    // Static method to sort students by percentage
    public static void sortStudent(Student s[], int n) {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (s[j].getper() > s[j + 1].getper()) {
                    // Swap students
                    Student temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }
        
        // Display sorted students
        System.out.println("Sorted list of students by percentage:");
        for (int i = 0; i < n; i++) {
            s[i].display();
        }
    }
}

class Studentclass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Get the number of students
        System.out.print("Enter the number of students: ");
        int n = Integer.parseInt(br.readLine());
        
        Student[] students = new Student[n];

        
        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the roll number: ");
            int rollno = Integer.parseInt(br.readLine());

            System.out.print("Enter the name: ");
            String name = br.readLine();

            System.out.print("Enter the percentage: ");
            float per = Float.parseFloat(br.readLine());

            // Create a new student object and add it to the array
            students[i] = new Student(rollno, name, per);

            // Display the number of objects created
            Student.counter();
        }
        
        // Sort and display the students by percentage
        Student.sortStudent(students, n);	
    }
}



// javac Studentclass.java
// java Studentclass