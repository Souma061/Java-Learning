/*
 * Develop a Java program for an online shopping cart. Allow users to add
 * products to the cart, view the
 * cart contents, and calculate the total price. Each product should have a
 * name, price, and quantity. Use
 * a class for products and implement a menu-driven system for user interaction.
 */

import java.util.Scanner;

class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}

public class Cart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] cart = new Product[200];
        int count = 0;

        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. View Cart");
            System.out.println("3. Calculate Total Price");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the product name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter the product price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter the product quantity: ");
                    int quantity = sc.nextInt();
                    sc.nextLine();
                    cart[count++] = new Product(name, price, quantity);
                    break;

                case 2:
                    System.out.println("Cart Contents:");
                    for (int i = 0; i < count; i++) {
                        System.out.println(
                                (i + 1) + ". " + cart[i].name + " - ₹" + cart[i].price + " X " + cart[i].quantity);
                    }
                    System.out.println("================================");
                    break;

                case 3:
                    double totalPrice = 0;
                    for (int i = 0; i < count; i++) {
                        totalPrice += cart[i].getTotalPrice();
                    }
                    System.out.println("Total Price: ₹" + totalPrice);
                    break;
            }
            sc.close();
        }

    }

}
