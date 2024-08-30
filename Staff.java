import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Staff{
    String name,address;
}

class FullTimeStaff extends Staff
{
    String department;
    double salary;
    public void accept() throws IOException
    {
        System.out.println("Enter the name,address,department,salary");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        name = br.readLine();
        address = br.readLine();
        department = br.readLine();
        salary=Double.parseDouble(br.readLine());
    }

    public void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);
        System.out.println("Department:"+department);
        System.out.println("Salary:"+salary);
        System.out.println("-------------");
    }
}
class PartTimeStaff extends Staff
{
    int hours,rate;
    public void accept() throws IOException
    {
        System.out.println("Enter name,address,No of Working hours and rate per hour:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        name = br.readLine();
        address = br.readLine();
        hours = Integer.parseInt(br.readLine());
        rate = Integer.parseInt(br.readLine());
    }

    public void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);
        System.out.println("No of Working hours:"+hours);
        System.out.println("Rate per Hour:"+rate);
        System.out.println("-------------");
    }
}

class StaffTime
{
    public static void main(String [] args) throws IOException
    {
        int i;
        System.out.println("Select Any One");
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("1.Full Time Staff");
        System.out.println("2.Part Time Staff");
        int ch = Integer.parseInt(br.readLine());
        switch(ch)
        {
            case 1 :
                    System.out.println("Enter The No Full Time Staff:");
                    int n = Integer.parseInt(br.readLine());
                    FullTimeStaff[] I=new FullTimeStaff[n];
                    for(i=0;i<n;i++)
                    {
                        I[i]=new FullTimeStaff();
                        I[i].accept();
                    }
                    for(i=0;i<n;i++)
                    {
                        I[i].display();
                    }
                    break;

            case 2 :
                    System.out.println("Enter The No Part Time Staff:");
                    int m = Integer.parseInt(br.readLine());
                    PartTimeStaff[] h=new PartTimeStaff[m];
                    for(i=0;i<m;i++)
                    {
                        h[i]=new PartTimeStaff();
                        h[i].accept();
                    }
                    for(i=0;i<m;i++)
                    {
                        h[i].display();
                    }
                    break;

        }
    }
}
