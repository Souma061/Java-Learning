/*
    Write a Java program to create a class called 'Book' with private instance variables title, author, and
price. Provide public getter and setter methods to access and modify these variables. Add a method
called applyDiscount() that takes a percentage as a parameter and reduces the price by that percentage.
 */
class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;

    }

    public void  setTitle(String title) {
        this.title = title;
        // return title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
        // return author;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public void applyDiscount(double percentage) {
        if (percentage < 0 || percentage > 100) {
            System.out.println("Invalid discount percentage. It should be between 0 and 100.");
            return;
        }
        price -= price * (percentage / 100);
    }

}
public class eighteen {
    public static void main(String[] args) {
        Book b1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 15.99);
        System.out.println("Title: " + b1.getTitle());
        System.out.println("Author: " + b1.getAuthor());
        System.out.println("Price: $" + b1.getPrice());
        b1.applyDiscount(10);
        System.out.println("Price after discount: $" + b1.getPrice());
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee", 12.99);
        System.out.println("Title: " + b2.getTitle());
        System.out.println("Author: " + b2.getAuthor());
        System.out.println("Price: $" + b2.getPrice());
        b2.applyDiscount(20);
        System.out.println("Price after discount: $" + b2.getPrice());
    }
}
