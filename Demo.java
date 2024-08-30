
import java.io.BufferedReader;
import java.io.InputStreamReader;

interface Operation
{
    final static float pi = 3.142f;
    void area();
    void volume();
}

class Cylinder implements Operation 
{
    double radius, height;

    void input() throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\n Enter the radius and height=");
        radius = Double.parseDouble(br.readLine());
        height = Double.parseDouble(br.readLine());
    }

    public void area()
    {
        double a = (2 * pi * radius * height) + (2 * pi * radius * radius);
        System.out.println("The area of cylinder is " + a);
    }

    public void volume() 
    {
        double v = pi * radius * radius * height;
        System.out.println("The volume of cylinder is " + v);
    }
}

class Demo
{
    public static void main(String args[]) throws Exception
    {
        Cylinder C1 = new Cylinder();

        C1.input();
        C1.area();
        C1.volume();
    }
}


// javac Demo.java
// java Demo 