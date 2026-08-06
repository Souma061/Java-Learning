/*
    Write a Java program to create a class Voter(voterId, name, age) with parameterized constructor.
The parameterized constructor should throw a checked exception if age is less than 18. The message
of exception is "invalid age for voter".
 */
import java.util.Scanner;
class Voter {
    private String voterId;
    private String name;
    private int age;

    Voter(String voterId, String name, int age) throws Exception {
        if (age < 18) {
            throw new Exception("invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public String getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class thirtyOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter voter id,name,age: ");
        String voterId = sc.next();
        String name = sc.next();
        int age = sc.nextInt();
        try {
            Voter voter = new Voter(voterId, name, age);
            System.out.println("Voter created successfully.");
            System.out.println("Voter ID: " + voter.getVoterId());
            System.out.println("Name: " + voter.getName());
            System.out.println("Age: " + voter.getAge());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
