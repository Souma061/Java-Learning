/*
    Write a Java program that accepts a person's full name as input and converts it into an initial format,
displaying only the initials of the first names followed by the full surname.
Example :
Input : Arjun Sachin Ramesh Tendulkar
Output : A.S.R.Tendulkar.
 */
import java.util.Scanner;
public class twentyFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the full name: ");
        String fullName = sc.nextLine();
        int cnt = 1;
        for (int i = 0; i < fullName.length(); i++) {
            if (fullName.charAt(i) == ' ') {
                cnt++;
            }
        }
        String[] names = new String[cnt];
        String temp = "";
        int index = 0;
        for (int i = 0; i < fullName.length(); i++) {
            if (fullName.charAt(i) == ' ') {
                names[index] = temp;
                index++;
                temp = "";
            } else {
                temp += fullName.charAt(i);
            }
        }
        names[index] = temp;
        for (int i = 0; i < names.length - 1; i++) {
            System.out.print(names[i].charAt(0) + ".");
        }

        System.out.println(names[names.length - 1]);
        sc.close();
    }
}
