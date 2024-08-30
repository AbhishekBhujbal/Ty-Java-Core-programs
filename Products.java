interface Trackable {
}
class Product implements Trackable {
    private static int count = 0; 
    private int productId;
    private String productName;
    private double productCost;
    private int productQuantity;

    
    public Product() {
        
    }

   
    public Product(int productId, String productName, double productCost, int productQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
        this.productQuantity = productQuantity;
        count++; 
    }    
    public int getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public double getProductCost() {
        return productCost;
    }
    public int getProductQuantity() {
        return productQuantity;
    }
    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Cost: " + productCost);
        System.out.println("Product Quantity: " + productQuantity);
        System.out.println();
    }
    public static int getProductCount() {
        return count;
    }
}

public class Products {
    public static void main(String[] args) {
        Product product1 = new Product(); 
        Product product2 = new Product(101, "Laptop", 799.99, 10); 
        Product product3 = new Product(102, "Smartphone", 299.99, 20); 

        System.out.println("Product 1:");
        product1.displayProduct();
        
        System.out.println("Product 2:");
        product2.displayProduct();
        
        System.out.println("Product 3:");
        product3.displayProduct();
    
        System.out.println("Total number of Product objects created: " + Product.getProductCount());
    }
}





// javac Products.java
// java Products 