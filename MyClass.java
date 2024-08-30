public class MyClass {

    int num;

    // Default constructor
    public MyClass() {
        num = 0;
    }

    // Parameterized constructor
    public MyClass(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        MyClass m1 = new MyClass();

        if (args.length > 0) {
            int n = Integer.parseInt(args[0]);
            MyClass m2 = new MyClass(n);
            System.out.println(m1.num);
            System.out.println(m2.num);
        } else {
            System.out.println("Insufficient arguments");
        }
    }
}

