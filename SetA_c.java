import java.util.Scanner;
class SetA_c {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("1. Calculate the volume of a cylinder");
            System.out.println("2. Find the factorial of a given number");
            System.out.println("3. Check if the number is Armstrong or not");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    calCylinderVolume();
                    break;
                case 2:
                    findFactorial();
                    break;
                case 3:
                    checkArmstrong();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
            System.out.println();
        } while (choice != 4);
        
        sc.close();
    }

    // Method to calculate the volume of a cylinder
    public static void calCylinderVolume() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        double r = sc.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double h = sc.nextDouble();
        
        double volume =3.14F * (r*r )* h;
        System.out.println("The volume of the cylinder is: " + volume);
    }

    // Method to find the factorial of a given number
    public static void findFactorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long fact = 1;
        
        for (int i = 1; i <= num; i++) {
            fact*= i;
        }
        
        System.out.println("The factorial of " + num + " is: " + fact);
    }

    // Method to check if a number is Armstrong or not
    public static void checkArmstrong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp,d=0,compare=num;

        while(num>0){
            temp=num%10;
            d=d+(temp*temp*temp);
            num=num/10;      
        }
        if (d == compare) {
            System.out.println(" is an Armstrong number.");
        } else {
            System.out.println(" is not an Armstrong number.");
        }
    }
}
