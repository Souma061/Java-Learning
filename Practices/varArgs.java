public class varArgs {
    public static void main(String[] args) {
        add(1, 2, 3, 4);
        average();
    }

    static void add(int... numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }

    static double average(double... numbers) {
        double sum = 0;
        if(numbers.length == 0) {
            System.out.println("No numbers provided.");
            return 0;
        }
        for (double num : numbers) {
            sum += num;
        }
        double avg = sum / numbers.length;
        System.out.println("Average: " + avg);
        return avg;

    }
}
