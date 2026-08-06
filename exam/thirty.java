/*
    Write a Java program to accept a decimal number from keyboard and convert it into Binary and Octal
base system. Read the decimal number as a private member of class Conversion.
 */
import java.util.Scanner;
class Conversion {
    private int decimalNumber;

    Conversion(int decimalNumber) {
        this.decimalNumber = decimalNumber;
    }

    void toBinary() {
        int num = decimalNumber;
        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }
        System.out.println("Binary representation: " + binary);
    }

    void toOctal() {
        int num = decimalNumber;
        String octal = "";
        while (num > 0) {
            octal = (num % 8) + octal;
            num /= 8;
        }
        System.out.println("Octal representation: " + octal);
    }
}
public class thirty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimalNumber = sc.nextInt();
        Conversion conversion = new Conversion(decimalNumber);
        conversion.toBinary();
        conversion.toOctal();
        sc.close();
    }
}
