import java.util.Scanner;

public class test {
  public static void main(String[] args) {
    final double PI = 3.14;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the radius of the Circle");
    double radius = scanner.nextDouble();
    double area = PI * (radius * radius);
    System.out.println("The area of Circle is: " + area);

    scanner.close();
  }
}
