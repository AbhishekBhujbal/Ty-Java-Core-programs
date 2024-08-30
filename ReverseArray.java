import java.util.Scanner;
class ReverseArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of elements");
        int n= sc.nextInt();

        int array[]=new int [n];
        
            System.out.println("enter the elements of array");
            for(int i=0;i<n;i++)
            {
                 array[i]=sc.nextInt();
            }

            System.out.println("Reverse array");
            for(int i=n-1;i>=0;i--)
            {
                System.out.println(array[i]+" ");
            }
        }
    }

