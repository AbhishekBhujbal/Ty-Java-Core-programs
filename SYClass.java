package Sy;
import java.io.IOException;
import java.util.Scanner;

public class SYClass {
    public int ct, mt, et;

    public void get() throws IOException {
        System.out.println("Enter marks of students for computer, maths, and electronics subjects out of 200");
        Scanner sc = new Scanner(System.in);
        
        // Assign the values to the instance variables
        ct = sc.nextInt();
        mt = sc.nextInt();
        et = sc.nextInt();
    }
}
