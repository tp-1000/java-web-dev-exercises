package exercises;
import java.util.Scanner;

public class Stringsearch {


    public static void main(String[] args) {
        String text = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister" +
                " was reading, but it had no pictures or conversations in it, 'and what is the use of" +
                " a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter search term: ");
        String searchTerm = input.nextLine();
        input.close();


        if (text.toLowerCase().contains(searchTerm.toLowerCase())) {
            int firstIndex = text.toLowerCase().indexOf(searchTerm.toLowerCase());
            System.out.println("The term " + searchTerm + " (length " + searchTerm.length() + ") appears at index " + firstIndex);

            String newText = text.substring(0,firstIndex) + text.substring(firstIndex + searchTerm.length());
            System.out.println(newText);
            return;
        }
        System.out.println("Search term not found.");
    }
}
