//Write a program in Java to calculate sum of 1 to N using getter and setter methods

public class thirtyThree {
    public static void main(String[] args) {
        SumCalculator calculator = new SumCalculator();
        calculator.setN(10);
        calculator.calculateSum();
        System.out.println("Sum of 1 to " + calculator.getN() + " is: " + calculator.getSum());
    }
}


class SumCalculator {
    private int n;
    private double sum;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSum() {
        return sum;
    }
    public void calculateSum() {
        sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
    }
}
