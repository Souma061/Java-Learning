import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuizLoader {
    // scans the questions/ folder and loads the questions into a list
    public static List<String> getAvailableTopics(String folderPath) {
        List<String> topics = new ArrayList<>();
        File folder = new File(folderPath);
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));
        if (files != null) {
            for (File file : files) {
                String topic = file.getName().replace(".txt", "");
                topics.add(topic);
            }
        }
        Collections.sort(topics);
        return topics;
    }

    // parse a topic files into a list of questions objects
    public static List<Question> loadQuestions(String filePath) throws IOException {
        List<Question> questions = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty())
                continue; // skip empty lines
            String questionsText = line;
            String optionsLine = reader.readLine().trim(); // read options line
            int correctOption = Integer.parseInt(reader.readLine().trim()); // read correct option line

            if (optionsLine == null || correctOption < 1 || correctOption > optionsLine.split("\\|").length) {
                System.out.println("Invalid question format in file: " + filePath);
                continue; // skip invalid question
            }
            String[] options = optionsLine.split("\\|");
            questions.add(new Question(questionsText, options, correctOption));

        }
        reader.close();
        return questions;
    }
}
