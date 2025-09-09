
public class KyleBrewerAssignment1A {

    /**
     * A recursive method that counts occurrences of Letter (case-insensitive)
     * in Word and returns the count.
     * @param Letter the character to count
     * @param Word   the string to search
     * @return number of occurrences of Letter in Word
     */
    public static int KyleBrewerMethod(char Letter, String Word) {
        
        if (Word == null || Word.length() == 0) {   // Base case
            return 0;
        }

        
        char target = Character.toUpperCase(Letter);
        char first  = Character.toUpperCase(Word.charAt(0)); // Changes all to uppercase for case sentivity. lol

        
        int add = (first == target) ? 1 : 0;
        return add + KyleBrewerMethod(Letter, Word.substring(1)); // this is my recursive call. 
    }

    /**
     * Prints a table of counts of each letter A to Z
     * @param Word the word to analyze
     */
    public static void KyleBrewerTable(String Word) {
        System.out.println("WORD = " + Word + ": ");
        System.out.println();

        // Optional header (matches example style)
        System.out.printf("%-8s%6s%n", "Letter", "Number");

        // Looping through A to Z
        for (char c = 'A'; c <= 'Z'; c++) {
            int count = KyleBrewerMethod(c, Word);
            System.out.printf("%-8c%6d%n", c, count);
        }

        System.out.println(); // Blank line after the table
        System.out.println("-----------------------------------------"); // This is my Separate line at the end of the table. 
    }

    /**
     * Main Method (Driver part)
     */
    public static void main(String[] args) {
      
        // Test cases
        KyleBrewerTable("cat");
        System.out.println(); // Blank line between tables

        KyleBrewerTable("dog");
        System.out.println(); // Blank line between tables

        KyleBrewerTable("STUDENT");
        System.out.println(); // Blank line between tables

        KyleBrewerTable("Dallas");
        System.out.println(); // Blank line between tables

        KyleBrewerTable("College");
        System.out.println(); // Blank line between tables

        KyleBrewerTable("JAVA");
        System.out.println(); // Blank line between tables

        KyleBrewerTable("Programming");
        System.out.println(); // Blank line between tables

        KyleBrewerTable("Supercalifragilisticexpialidocious");

        
    }
}
