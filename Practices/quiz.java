import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // Questions array[][]
        Question[] queStrings = {
                new Question("What is the capital of France?",
                        new String[] { "A) Paris", "B) London", "C) Rome", "D) Berlin" }, 1),
                new Question("Which planet is known as the Red Planet?",
                        new String[] { "A) Earth", "B) Jupiter", "C) Mars", "D) Saturn" }, 3),
                new Question("Who wrote 'Romeo and Juliet'?",
                        new String[] { "A) William Shakespeare", "B) Charles Dickens", "C) Mark Twain",
                                "D) Jane Austen" },
                        1),
                new Question("What is the chemical formula for water?",
                        new String[] { "A) H2O", "B) CO2", "C) O2", "D) NaCl" }, 1),
                new Question("Which mountain is the tallest in the world?",
                        new String[] { "A) Mount Everest", "B) K2", "C) Kangchenjunga", "D) Lhotse" }, 1),
                new Question("Who painted the Mona Lisa?",
                        new String[] { "A) Leonardo da Vinci", "B) Vincent van Gogh", "C) Pablo Picasso",
                                "D) Michelangelo" },
                        1),
                new Question("Which country has the smallest population?",
                        new String[] { "A) Vatican City", "B) Monaco", "C) Nauru", "D) San Marino" }, 1),
                new Question("What is the currency of Japan?",
                        new String[] { "A) Yen", "B) Dollar", "C) Euro", "D) Pound" }, 1),
                new Question("Who is the current President of the United States?",
                        new String[] { "A) Joe Biden", "B) Donald Trump", "C) Barack Obama", "D) George Bush" }, 1),
                new Question("Which ocean is the largest?",
                        new String[] { "A) Atlantic Ocean", "B) Indian Ocean", "C) Arctic Ocean", "D) Pacific Ocean" },
                        4)
        };
        // options array[][]
        // String[][] options = {
        //         { "A) Paris", "B) London", "C) Rome", "D) Berlin" },
        //         { "A) Earth", "B) Jupiter", "C) Mars", "D) Saturn" },
        //         { "A) William Shakespeare", "B) Charles Dickens", "C) Mark Twain", "D) Jane Austen" },
        //         { "A) H2O", "B) CO2", "C) O2", "D) NaCl" },
        //         { "A) Mount Everest", "B) K2", "C) Kangchenjunga", "D) Lhotse" },
        //         { "A) Leonardo da Vinci", "B) Vincent van Gogh", "C) Pablo Picasso", "D) Michelangelo" },
        //         { "A) Vatican City", "B) Monaco", "C) Nauru", "D) San Marino" },
        //         { "A) Yen", "B) Dollar", "C) Euro", "D) Pound" },
        //         { "A) Joe Biden", "B) Donald Trump", "C) Barack Obama", "D) George Bush" },
        //         { "A) Atlantic Ocean", "B) Indian Ocean", "C) Arctic Ocean", "D) Pacific Ocean" },
        // };

        // int answers[] = { 1, 2, 1, 1, 1, 1, 1, 1, 1, 4 };

        // declare variables
        int score = 0;
        int userAnswer;
        int totalQues = queStrings.length;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Quiz!");

        // welcome message
        // loop through questions and options

        for (int i = 0; i < totalQues; i++) {
            System.out.println(queStrings[i]);
            for (int j = 0; j < queStrings[i].options.length; j++) {
                System.out.println(queStrings[i].options[j]);
            }
            System.out.print("Enter your answer (1-4): ");
            while (!input.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number between 1 and 4: ");
                input.next(); // consume the invalid input
            }
            userAnswer = input.nextInt();
            if (userAnswer < 1 || userAnswer > 4) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                i--; // repeat the same question
                continue;
            }
            if (userAnswer == queStrings[i].correctAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is: " + queStrings[i].options[queStrings[i].correctAnswer - 1]);
            }

        }
        input.close();
        System.out.println("Quiz Over! Your final score is: " + score + "/" + totalQues);
        if (score == totalQues) {
            System.out.println("Excellent! You got a perfect score!");
        } else if (score >= totalQues * 0.7) { // 7+ out of 10
            System.out.println("Good job! You scored above average.");
        } else if (score >= totalQues * 0.5) { // 5-6 out of 10
            System.out.println("Not bad, but there's room for improvement.");
        } else {
            System.out.println("Better luck next time! Keep practicing.");
        }

        // get user input
        // check if answer is correct
        // keep track of score
        // display final score

    }

    static class Question {
        String question;
        String[] options;
        int correctAnswer;

        public Question(String question, String[] options, int correctAnswer) {
            this.question = question;
            this.options = options;
            this.correctAnswer = correctAnswer;
        }
    }
}
