import java.util.Scanner;
public class shopping_cart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String item1, item2, item3;
        int quantity1, quantity2, quantity3;
        double price1, price2, price3, total;


        System.err.println("Enter the name of the first item: ");
        item1 = sc.nextLine();
        System.err.println("Enter the quantity of the first item: ");
        quantity1 = sc.nextInt();
        System.err.println("Enter the price of the first item: ");
        price1 = sc.nextDouble();
        sc.nextLine();

        System.err.println("Enter the name of the second item: ");
        item2 = sc.nextLine();
        System.err.println("Enter the quantity of the second item: ");
        quantity2 = sc.nextInt();
        System.err.println("Enter the price of the second item: ");
        price2 = sc.nextDouble();
        sc.nextLine();


        System.err.println("Enter the name of the third item: ");
        item3 = sc.nextLine();
        System.err.println("Enter the quantity of the third item: ");
        quantity3 = sc.nextInt();
        System.err.println("Enter the price of the third item: ");
        price3 = sc.nextDouble();


        total = (quantity1 * price1) + (quantity2 * price2) + (quantity3 * price3);

        System.out.println("Shopping Cart Summary:");
        System.out.println(item1 + " - Quantity: " + quantity1 + ", Price: " + price1 + " rupees");
        System.out.println(item2 + " - Quantity: " + quantity2 + ", Price: " + price2 + " rupees");
        System.out.println(item3 + " - Quantity: " + quantity3 + ", Price: " + price3 + " rupees");
        System.out.println("Total Cost: " + total + " rupees");


    }
}
