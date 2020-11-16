import java.io.*;
import java.util.*;
public class TheMiddleLetter {

    public static void main(String[] args)throws Exception {
        Scanner input = new Scanner(new File("TheMiddleLetter.txt"));
        String total = "";
        BufferedReader reader = new BufferedReader(new FileReader("TheMiddleLetter.txt"));
        int lines = 0;
        while (reader.readLine() != null) lines++;
        reader.close();
        for(int i = 0;i < lines; i++){
            String sentence = "";
            sentence = input.nextLine();
            total += sentence.charAt(sentence.length()/2);
        }
        System.out.println(total);
    }
}
