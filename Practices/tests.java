public class tests {
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;

        if (a.equals(b)) {
            System.out.println("a and b are equal using equals method.");
        } else {
            System.out.println("a and b are not equal using equals method.");
        }
    }
}

// why Integer 127 == Integer 127 but Integer 128 != Integer 128?In Java, the
// Integer class caches Integer objects for values in the range of -128 to 127.
// This means that when you create an Integer object with a value within this
// range, it will return the same cached object. Therefore, when you compare
// Integer objects with values of 127 using the '==' operator, it returns true
// because they reference the same cached object.
