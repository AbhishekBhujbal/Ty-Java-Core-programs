/*Wrire a java program .Define an interface "Operation" which has methods area(),
volume(). Define a constant PI having a value 3.142.Create a class cylinder 
which implements this interface (members radius, height) Create one object and
calculate the area and volume.*/  


interface Operation {
    double PI = 3.142; 

    double area();
    double volume();
}


class Cylinder implements Operation {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    
    @Override
    public double area() {
        return 2 * PI * radius * (radius + height);
    }
    @Override
    public double volume() {
        return PI * radius * radius * height;
    }
}
public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5.0, 10.0);
        System.out.println("Area of Cylinder: " + cylinder.area());
        System.out.println("Volume of Cylinder: " + cylinder.volume());
    }
}
