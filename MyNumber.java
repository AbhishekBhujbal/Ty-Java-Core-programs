import java.util.Scanner;

public class MyNumber
{
    private int x;
    public MyNumber()
    {
        x=0;
    }

    private MyNumber(int x)
    {
        this.x=x;
    }

    public boolean isNegative()
    {
        if(x<0)
        return true;
        else
        return false;
    }

    public boolean isPositive()
    {
        if(x>0)
        return true;
        else
        return false;
    }

    public boolean isEven()
    {
        if(x%2==0)
        return true;
        else
        return false;
    }

    public boolean isOdd()
    {
        if(x%2!=0)
        return true;
        else
        return false;
    }

    public boolean isZero()
    {
        if(x==0)
        return true;
        else
        return false;
    }

    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int x=sc.nextInt();
        MyNumber m = new MyNumber(x);

        if(m.isOdd())
        System.out.println("Odd");

        if(m.isEven())
        System.out.println("Even");

        if(m.isPositive())
        System.out.println("Positive");

        if(m.isNegative())
        System.out.println("Negative");

        if(m.isZero())
        System.out.println("Zero");
    }
}