//Write a program in Java to perform Method Overloading by changing number of arguments
public class twentySix {
    static int add(int a, int b) {
        return a + b;
    }
    static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println("Sum of two integers: " + add(5, 10));
        System.out.println("Sum of three integers: " + add(5, 10, 15));
    }
}
