import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Scoreboard {
    private static final String SCOREBO_FILE = "scoreboard.txt";
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public static void saveScore(String topic, int score, int total) {
        try (FileWriter fw = new FileWriter(SCOREBO_FILE, true)) {
            fw.write(LocalDateTime.now().format(dtf)
                    + " - Topic: " + topic + ", Score: " + score + "/" + total + "\n"

            );
        } catch (IOException e) {
            System.err.println("Error saving score: " + e.getMessage());

        }
    }

    public static void display() {
        File file = new File(SCOREBO_FILE);
        if (!file.exists()) {
            System.out.println("No scores recorded yet.");
            return;
        }
        System.out.println("Scoreboard:");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading scoreboard: " + e.getMessage());
        }

    }
}
