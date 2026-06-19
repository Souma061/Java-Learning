import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double a = sc.nextDouble();

    double area = Math.PI * a * a;
    double circumference = 2 * Math.PI * a;
    System.out.printf("%.2f\n", circumference);
    System.out.printf("%.2f\n", area);


    // System.out.printf("%.2f", triangleAreaUsingHeronFormula);

    sc.close();
  }
}
