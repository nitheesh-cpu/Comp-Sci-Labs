import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Redact {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("Redact.txt"));
        System.out.println("Enter a phrase:");
        String phrase = input.nextLine();
        System.out.println("Enter keyword to redact:");
        String keyword = input.nextLine();
        System.out.println("Enter number of additional question marks to add:");
        int numOfMarks = input.nextInt();
        System.out.println("Redacted phrase:");
        Redaction(phrase,keyword,numOfMarks);
    }
    public static void Redaction (String phrase, String Keyword, int numOfMarks) {
        int where = 0;
        int amount = 0;
        String lowerPhrase = phrase;
        String lowerKeyword = Keyword;
        String redacted = "";
        lowerPhrase = lowerPhrase.toLowerCase();
        lowerKeyword = lowerKeyword.toLowerCase();
        String spacedKeyword = lowerKeyword;
        spacedKeyword = " " + spacedKeyword + " ";
        int letters = 0;
        for (int i = 0; i < lowerKeyword.length(); i++){
            letters++;
        }
        int firstLetters = letters;
        letters += numOfMarks;
        String QuestionMarks = ""
        for(int m = 0; m <letters; m++) {
            QuestionMarks += "?";
        }
        redacted = phrase.replace(spacedKeyword," "+QuestionMarks+" ");
        System.out.println(redacted);
        do {
            where = lowerPhrase.indexOf(spacedKeyword);
            if(where == -1)
                break;
            lowerPhrase = lowerPhrase.substring((where-1)+ (spacedKeyword.length()));
            amount++;
        }while(1==1);
        int amountOfQs = amount*letters;
        System.out.print("Total question marks in redacted phrase: ");
        System.out.println(amountOfQs);
    }
}
