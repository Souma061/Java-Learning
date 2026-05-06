import java.util.Scanner;
public class madlibs_game {
    public static void main(String[] args) {


        System.out.println("Once upon a time, there was a _______ (adjective) _______ (noun) who lived in a _______ (adjective) _______ (noun). Every day, the _______ (noun) would _______ (verb) and _______ (verb), dreaming of one day becoming a _______ (adjective) _______ (noun). One day, the _______ (noun) decided to _______ (verb), and it lived happily ever after.");
        Scanner sc = new Scanner(System.in);

        String adjective1, adjective2, adjective3, noun1, noun2, noun3, verb1, verb2, verb3;
        System.out.println("Enter an adjective(Description): ");
        adjective1 = sc.nextLine();
        System.out.println("Enter another adjective( Description): ");
        adjective2 = sc.nextLine();
        System.out.println("Enter a third adjective( Description): ");
        adjective3 = sc.nextLine();
        System.out.println("Enter a noun(Name): ");
        noun1 = sc.nextLine();
        System.out.println("Enter another noun(Name): ");
        noun2 = sc.nextLine();
        System.out.println("Enter a third noun(Name): ");
        noun3 = sc.nextLine();
        System.out.println("Enter a verb(Action): ");
        verb1 = sc.nextLine();
        System.out.println("Enter another verb(Action): ");
        verb2 = sc.nextLine();
        System.out.println("Enter a third verb(Action): ");
        verb3 = sc.nextLine();


        System.out.println("Once upon a time, there was a " + adjective1 + " " + noun1 + " who lived in a " + adjective2 + " " + noun2 + ". Every day, the " + noun1 + " would " + verb1 + " and " + verb2 + ", dreaming of one day becoming a " + adjective3 + " " + noun3 + ". One day, the " + noun1 + " decided to " + verb3 + ", and it lived happily ever after.");

        sc.close();
    }
}


// Once upon a time, there was a king(adjective) who lived in a castle(noun). Every day, the king would eat and sleep, dreaming of one day becoming a brave knight(adjective). One day, the king decided to fight(verb), and it lived happily ever after.
