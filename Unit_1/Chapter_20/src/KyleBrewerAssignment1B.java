import java.io.*;
import java.util.*;

public class KyleBrewerAssignment1B {

    /**
     * This is my method to determine if a character is part of a word. Helps with tokens and delimiters for me 
     * @param character
     * @return true if the character is a letter, digit, '+', '#', or '-'
     */
    private static boolean isWordChar(char character) {
        return Character.isLetterOrDigit(character) || character == '+' || character == '#' || character == '-';
    }

    /**
     * This is my method to read the file and extract words.
     * @param filePath
     * @return List of words from the file
     */
    public List<String> readFileTxt(String filePath) {
        List<String> words = new ArrayList<>();

        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            
            while ((line = reader.readLine()) != null) {
                
                StringBuilder token = new StringBuilder();

                for (int i = 0; i < line.length(); i++) {
                    char character = line.charAt(i);

                    if (isWordChar(character)) {
                    
                        token.append(character);
                    } else {
                        
                        if (token.length() > 0) {
                            String word = token.toString().trim().toLowerCase();
                            if (!word.isEmpty()) {
                                words.add(word);
                            }
                            token.setLength(0); 
                        }
                    }
                }

              
                if (token.length() > 0) {
                    String word = token.toString().trim().toLowerCase();
                    if (!word.isEmpty()) {
                        words.add(word);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error: Could not read the file at: " + filePath);
            System.out.println("Details: " + e.getMessage());
            System.out.println("Tip: Make sure the file exists in your project folder or give a full path.");
        }

        return words;
    }


    /**
     * This is my method to create a priority queue from the list of words.
     * @param words
     * @return PriorityQueue containing the words
     */
    public Queue<String> KyleBrewerPriorityQueue(List<String> words) {
        Queue<String> KyleBrewerStructure = new PriorityQueue<>();
        for (String word : words) {
            if (word != null && !word.isEmpty()) {
                KyleBrewerStructure.add(word);
            }
        }
        return KyleBrewerStructure;
    }

  
    /**
     * This is my method to print the words in alphabetical order.
     * @param PriorityQueue
     */
    public void printABC(Queue<String> PriorityQueue) {
        System.out.println("\n--- Words in ABC Order for My Teacher ---");
        while (!PriorityQueue.isEmpty()) {
            System.out.println(PriorityQueue.poll());
        }
    }

    /**
     * The main method to run the program. This is my Driver code.
     * @param args
     */
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to the Assignment 1B Word Sorter!");
            System.out.println("This program reads words from a file, sorts them alphabetically using a priority queue, and displays them.");
            System.out.println("Software Engineer: Kyle Brewer");
            System.out.println();
            System.out.print("Please enter the path to the input file (or press ENTER to use the default 'C:/Users/kyleb/Desktop/Projects/School/Programming_Fundmentals/Unit_1/Chapter_20/Assignment1BData.txt'): ");
            String filePath = scanner.nextLine().trim();
            if (filePath.isEmpty()) {
                filePath = "C:/Users/kyleb/Desktop/Projects/School/Programming_Fundmentals/Unit_1/Chapter_20/Assignment1BData.txt";
            }
            System.out.println("\nPress ENTER to run the program and display the sorted words...");
            scanner.nextLine();

            KyleBrewerAssignment1B assignment1B = new KyleBrewerAssignment1B();
            List<String> words = assignment1B.readFileTxt(filePath);
            Queue<String> KyleBrewerPriorityQueue = assignment1B.KyleBrewerPriorityQueue(words);
            assignment1B.printABC(KyleBrewerPriorityQueue);

            System.out.println("\nThank you for using the Word Sorter. Goodbye!");
        }
    }
}
