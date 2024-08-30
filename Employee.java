import java.util.Scanner;

public class Employee {
    int id;
    String name;
    String deptname;
    float salary;

    static int numberofobjects = 0;

    Employee() {        
    }

    Employee(int id, String name, String deptname, float salary) {
        this.id = id;
        this.name = name;
        this.deptname = deptname;
        this.salary = salary;
        numberofobjects++;
    }

    public void display() {
        System.out.println("Employee id: " + id);
        System.out.println("Employee name: " + name);
        System.out.println("Employee deptname: " + deptname);
        System.out.println("Employee salary: " + salary);
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Employees do you want to enter?  ");

        n = sc.nextInt();

        Employee[] ob = new Employee[n];
        for (int i = 0; i < n; i++) {
            sc = new Scanner(System.in);
            System.out.println("Enter id of Employee " + (i + 1) + ":");
            int id = sc.nextInt();

            System.out.println("Enter name of Employee " + (i + 1) + ":");
            sc.nextLine(); 
            String name = sc.nextLine();

            System.out.println("Enter deptname of Employee " + (i + 1) + ":");
            String deptname = sc.nextLine();

            System.out.println("Enter salary of Employee " + (i + 1) + ":");
            float salary = sc.nextFloat();

            ob[i] = new Employee(id, name, deptname, salary);
            System.out.println("Number of objects: " + numberofobjects);
        }

        for (int i = 0; i < n; i++) {
            ob[i].display();
        }
    }
}
