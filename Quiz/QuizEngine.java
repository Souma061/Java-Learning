import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuizEngine {
    private List<Question> questions;
    private int score;
    private Scanner scanner;

    public QuizEngine(List<Question> questions, Scanner scanner) {
        this.questions = questions;
        // this.score = 0;
        this.scanner = scanner;
    }

    public void shuffle() {
        Collections.shuffle(questions);
    }

    public void limit(int n) {
        if (n < questions.size()) {
            questions = questions.subList(0, n); // limit the questions to n
        }
    }

    public int run() {
        int total = questions.size();
        for (int i = 0; i < total; i++) {
            Question q = questions.get(i);
            System.out.println("Question " + (i + 1) + ": " + q.question);
            for (String option : q.options) {
                System.out.println(" - " + option);
            }
            int userAnswer = getUserAnswer();
            if (userAnswer == q.correctOptionl) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is: " + q.options[q.correctOptionl - 1]);
            }

        }
        return score;
    }

    public int getTotal() {
        return questions.size();
    }
    public int getUserAnswer() {
        while (true) {
            System.out.println("Enter your answer (1-" + questions.get(0).options.length + "): ");
            try {
                int answer = Integer.parseInt(scanner.nextLine());
                if (answer >= 1 && answer <= questions.get(0).options.length) {
                    return answer;
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and "
                            + questions.get(0).options.length + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println(
                        "Invalid input. Please enter a number between 1 and " + questions.get(0).options.length + ".");
            }
        }
    }

}
