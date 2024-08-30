// 4) Write a java program that take input as a person name in the format of first, middle
// and last name and then print it in the form last, first and middle name, where in the
// middle name first character is capital letter.
import java.util.Scanner;
class Person{
    String fname,mname,lname;
    int len;
    
    void accept(){
        System.out.println("Enter First Name :");
        Scanner sc=new Scanner(System.in);
        fname=sc.next();
        
        System.out.println("Enter Middle Name :");
        mname=sc.next();
            
        System.out.println("Enter Last Name :");
        lname=sc.next();
        len=mname.length();

            String f=mname.substring(0,1);
            String l=mname.substring(1,len);
        f=f.toUpperCase();
        mname=f+l;
        
    }
    void display(){
        System.out.println("Last Name :"+lname);
        System.out.println("First Name :"+fname);
        System.out.println("Middle Name :"+mname);
        }
        public static void main(String a[]){
            Person p=new Person();
            p.accept();
            p.display();
        }
}