public class twentySeven {
    static int add(int... num) {
        int sum = 0;
        for (int n : num) {
            sum += n;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Sum of integers: " + add(5, 10));
        System.out.println("Sum of integers: " + add(5, 10, 15));
        System.out.println("Sum of integers: " + add(5, 10, 15, 20));
    }
}
