/*
    Write a Java program to create class Product (pid, price, quantity) with parameterized constructor.
Create a main function in different class (say XYZ) and perform following task :
(a) Accept five product information from user and store in an array.
(b) Find Pid of product with highest price.
(c) Create method (with array of product's object as argument) in XYZ class to calculate and return
total amount spent on all products. (amount spent on single product=price of product * quantity of
product).
 */
import java.util.Scanner;
class Product {
    private int pid;
    private double price;
    private int quantity;

    Product(int pid, double price, int quantiity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantiity;
    }

    public int getPid() {
        return pid;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

}

public class twentySix {
    static double totalAmountSpent(Product[] products) {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter product id, price and quantity for product " + (i + 1) + ":");
            int pid = sc.nextInt();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();
            products[i] = new Product(pid, price, quantity);
        }
        // find product with highest price
        double maxPrice = products[0].getPrice();
        int maxPricePid = products[0].getPid();
        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() > maxPrice) {
                maxPrice = products[i].getPrice();
                maxPricePid = products[i].getPid();
            }
        }
        System.out.println("Product with highest price has pid: " + maxPricePid);
        double totalAmount = totalAmountSpent(products);
        System.out.println("Total amount spent on all products: " + totalAmount);
        sc.close();
    }
}
