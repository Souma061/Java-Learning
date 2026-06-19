public class methods {
    public static void main(String[] args) {
        method1("Method 1");

        float result = division(10, 2);
        System.out.println(result);
        calculator(10, 2, "*");

    }

    static void method1(String name) {
        // System.out.println("Method 1");
        System.out.println(name);
    }

    static float division(float a, float b) {
        return a / b;
    }

    static void calculator(float a, float b, String operator) {
        switch (operator) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
