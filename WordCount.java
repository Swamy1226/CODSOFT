import java.io.*;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = "";
        System.out.println("Please choose an option:");
        System.out.println("1. Enter text manually");
        System.out.println("2. Provide a file");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Enter the text:");
                inputText = scanner.nextLine();
                break;
            case 2:
                System.out.println("Enter the file path:");
                String filePath = scanner.nextLine();
                try {
                    inputText = readFile(filePath);
                } catch (IOException e) {
                    System.out.println("Error reading the file: " + e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        int wordCount = countWords(inputText);
        System.out.println("Total number of words: " + wordCount);
    }

    private static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }
        reader.close();
        return content.toString();
    }

    private static int countWords(String text) {
        String[] words = text.split("[\\s\\p{Punct}]+");
        return words.length;
    }
}
