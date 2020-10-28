import java.util.Scanner;
public class FindAndReplace {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String sentence, word, replacementWord, finalSentence;
        System.out.println("Enter a sentence:");
        sentence = input.nextLine();
        System.out.println("Enter a word:");
        word = input.nextLine();
        System.out.println("Enter a replacement word:");
        replacementWord = input.nextLine();
        finalSentence = sentence.replaceAll(word,replacementWord);
        System.out.println(sentence);
        System.out.println(finalSentence);
    }
}
