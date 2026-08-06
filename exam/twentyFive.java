import java.io.*;
import java.util.*;

public class twentyFive {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("input.txt");
        Scanner sc = new Scanner(input);
        PrintWriter pw = new PrintWriter("output.txt");
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                pw.println(num);
            }
        }
        sc.close();
        pw.close();
        Scanner out = new Scanner(new File("output.txt"));
        while (out.hasNextInt()) {
            System.out.println(out.nextInt());
        }
        out.close();
    }
}
