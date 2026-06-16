/*
Develop a Java program for reading and displaying the content of a text file. Implement exception
handling to address potential issues, such as file not found (FileNotFoundException) and IO errors.
 */

// 1. Create a text file
// 2. Read the file and display its content with exception handling
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    static void createFile(String filename) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Hello, this is a sample text file.\n");
            writer.write("This file is created for demonstrating file handling in Java.\n");
            writer.write("You can read this file and display its content using the program.\n");
        }
        System.out.println("File created successfully: " + filename);
    }

    static void readFile(String filename) throws IOException, FileNotFoundException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Reading file: " + filename);
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
    public static void main(String[] args) {
        String filename = "sample2.txt";
        try {
            createFile(filename);
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
        try {
            readFile(filename);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
