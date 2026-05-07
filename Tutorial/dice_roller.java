import java.util.Random;
import java.util.Scanner;

public class dice_roller {

    // declare a variable
    // get # of dice and sides from user
    // check if the input is valid
    // roll the dice and display the result
    // show all the rolls and the total
    // ASCII art of dice
    void main() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int total = 0;
        System.err.println("Welcome to the Dice Roller!");
        System.out.println("Enter the # of dice to roll: ");
        int numDice = sc.nextInt();
        if (numDice > 0) {
            for (int i = 0; i < numDice; i++) {
                int roll = rand.nextInt(6) + 1;
                printDie(roll);
                System.out.println("Roll " + (i + 1) + ": " + roll);
                total += roll;
            }
            System.out.println("Total: " + total);
        } else {
            System.out.println("Invalid input. Please enter a positive integer.");
        }
        sc.close();
    }

    static void printDie(int roll) {
        String Dice1 = """
                +-------+
                |       |
                |   ●   |
                |       |
                +-------+
                                                                """;

        String Dice2 = """
                +-------+
                | ●     |
                |       |
                |     ● |
                +-------+
                                                                """;
        String Dice3 = """
                +-------+
                | ●     |
                |   ●   |
                |     ● |
                +-------+
                                                                                                                        """;
        String Dice4 = """
                +-------+
                | ●   ● |
                |       |
                | ●   ● |
                +-------+
                                                                                                                        """;
        String Dice5 = """
                +-------+
                | ●   ● |
                |   ●   |
                | ●   ● |
                +-------+
                                                                                                                                                                                """;
        String Dice6 = """
                +-------+
                | ●   ● |
                | ●   ● |
                | ●   ● |
                +-------+
                                                                                                                                                                                """;
        switch (roll) {
            case 1:
                System.out.println(Dice1);
                break;

            case 2:
                System.out.println(Dice2);
                break;

            case 3:
                System.out.println(Dice3);
                break;

            case 4:
                System.out.println(Dice4);
                break;

            case 5:
                System.out.println(Dice5);
                break;

            case 6:
                System.out.println(Dice6);
                break;

            default:
                System.out.println("Invalid dice value");
                break;
        }
    }
}
