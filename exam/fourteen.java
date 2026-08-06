import java.util.*;
public class fourteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with length 3:  ");
        String str = sc.nextLine();
        if (str.length() != 3) {
            System.out.println("Give exactly 3 characters");
            return;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k=0;k<3;k++) {
                    if(i != j && j != k && i != k) {
                        System.out.println(str.charAt(i) + "" + str.charAt(j) + "" + str.charAt(k));
                    }
                }
            }
        }
        sc.close();
    }
}
