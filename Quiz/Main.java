import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final String QUESTIONS_FOLDER = "questions/";
    static final int QUESTION_LIMIT = 10;

    private static int getUserChoice(Scanner scanner, int min, int max) {
        while (true) {
            String input = scanner.nextLine().trim();
            try {
                int choice = Integer.parseInt(input);
                if (choice >= min && choice <= max) {
                    return choice;
                }
            } catch (NumberFormatException ignored) {
            }
            System.out.print("Invalid choice. Please enter a number between " + min + " and " + max + ": ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the CLI Quiz!");
        System.out.println("Available topics:");
        List<String> topics = QuizLoader.getAvailableTopics(QUESTIONS_FOLDER);
        for (int i = 0; i < topics.size(); i++) {
            System.out.println((i + 1) + ". " + topics.get(i));
        }
        System.out.print("Select a topic by entering the corresponding number: ");
        int topicChoice = getUserChoice(scanner, 1, topics.size());
        String selectedTopic = topics.get(topicChoice - 1);
        System.out.println("You selected: " + selectedTopic);
        try {
            List<Question> questions = QuizLoader.loadQuestions(QUESTIONS_FOLDER + selectedTopic + ".txt");
            QuizEngine quiz = new QuizEngine(questions, scanner);
            quiz.shuffle();
            quiz.limit(QUESTION_LIMIT);
            int score = quiz.run();
            System.out.println("Quiz Over! Your final score is: " + score + "/" + quiz.getTotal());
            Scoreboard.saveScore(selectedTopic, score, quiz.getTotal());
        } catch (IOException e) {
            System.err.println("Error loading questions: " + e.getMessage());
        }
        System.out.println("Do you want to view the scoreboard? (y/n): ");
        String viewScoreboard = scanner.nextLine().trim().toLowerCase();
        if (viewScoreboard.equals("y") || viewScoreboard.equals("yes")) {
            Scoreboard.display();
        }
    }
}
