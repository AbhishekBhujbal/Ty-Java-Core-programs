package Student;

import java.io.IOException;
import java.util.Scanner;

import Sy.SYClass;
import Ty.TYClass;

public class StudentMarks {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();

        SYClass sy[] = new SYClass[n];
        TYClass ty[] = new TYClass[n];
        StudentInfo si[] = new StudentInfo[n];

        for (int i = 0; i < n; i++) {
            si[i] = new StudentInfo();
            sy[i] = new SYClass();
            ty[i] = new TYClass();
            
            // Getting data for each student
            si[i].get();
            sy[i].get();
            ty[i].get();

            // Calculate totals and percentage
            si[i].syt = sy[i].ct + sy[i].et + sy[i].mt;
            si[i].tyt = ty[i].pm + ty[i].tm;
            si[i].gt = si[i].syt + si[i].tyt;
            si[i].per = (si[i].gt / 1200) * 100;

            // Assign grade based on percentage
            if (si[i].per >= 70) si[i].grade = "A";
            else if (si[i].per >= 60) si[i].grade = "B";
            else if (si[i].per >= 50) si[i].grade = "C";
            else if (si[i].per >= 40) si[i].grade = "Pass";
            else si[i].grade = "Fail";
        }

        // Print the results
        System.out.println("Roll No\tName\tSyTotal\tTyTotal\tGrandTotal\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println(si[i].rollno + "\t" + si[i].name + "\t" + si[i].syt + "\t" + si[i].tyt + "\t" + si[i].gt + "\t\t" + si[i].per + "\t\t" + si[i].grade);
        }
    }
}
