import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
      int a = 10;
      int b = 20;
      int sum = a + b;
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a number: ");
      // System.out.println();
      String name = scanner.nextLine();

      System.out.println("Hello, " + name + "!");

      System.out.println("The sum of a and b is: " + sum);

      scanner.close();

	}
}
