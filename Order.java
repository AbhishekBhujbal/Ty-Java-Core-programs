import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Order
{
    String id,description;
}

class PurchaseOrder extends Order
{
    String CustomerName,VendorName;
    public void accept() throws IOException
    {
        System.out.println("Enter the id,description,Name of Customer and Vendors:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        id = br.readLine();
        description = br.readLine();
        CustomerName = br.readLine();
        VendorName = br.readLine();
    }

    public void display()
    {
        System.out.println("id:"+id);
        System.out.println("Description:"+description);
        System.out.println("CustomerName:"+CustomerName);
        System.out.println("VendorName:"+VendorName);
        System.out.println("-------------");
    }
}
class SalesOrder extends Order
{
    String CustomerName,VendorName;
    public void accept() throws IOException
    {
        System.out.println("Enter the id,description,Name of Customer and Vendors:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        id = br.readLine();
        description = br.readLine();
        CustomerName = br.readLine();
        VendorName = br.readLine();
    }

    public void display()
    {
        System.out.println("id:"+id);
        System.out.println("Description:"+description);
        System.out.println("CustomerName:"+CustomerName);
        System.out.println("VendorName:"+VendorName);
        System.out.println("-------------");
    }
}
class Main
{
    public static void main(String [] args) throws IOException
    {
        int i;
        System.out.println("Select Any One");
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("1.Purchase Order");
        System.out.println("2.Sales Order");
        int ch = Integer.parseInt(br.readLine());
        switch(ch)
        {
            case 1 :
                    System.out.println("Enter The Number of purchase Order:");
                    int n = Integer.parseInt(br.readLine());
                    PurchaseOrder[] I=new PurchaseOrder[n];
                    for(i=0;i<n;i++)
                    {
                        I[i]=new PurchaseOrder();
                        I[i].accept();
                    }
                    for(i=0;i<n;i++)
                    {
                        I[i].display();
                    }
                    break;

            case 2 :
                    System.out.println("Enter The Number of Sales order:");
                    int m = Integer.parseInt(br.readLine());
                    SalesOrder[] h=new SalesOrder[m];
                    for(i=0;i<m;i++)
                    {
                        h[i]=new SalesOrder();
                        h[i].accept();
                    }
                    for(i=0;i<m;i++)
                    {
                        h[i].display();
                        System.out.println("Object is Created");
                    }
                    break;

        }
    }
}


// javac Order.java
// java Main  