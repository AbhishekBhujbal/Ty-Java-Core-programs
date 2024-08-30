package Ty;
import java.io.IOException;
import java.util.Scanner;

public class TYClass {
    public int tm,pm;

    public void get() throws IOException {
        System.out.println("Enter the marks of the theory out of 400 and practicals out of 200: ");
        Scanner sc = new Scanner(System.in);
        
        // Assign the values to the instance variables
        tm = sc.nextInt();
        pm = sc.nextInt();
      
    }
}