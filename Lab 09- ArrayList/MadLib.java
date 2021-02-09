import java.io.*;
import java.util.*;

public class MadLib {
    public static void main(String[] arg) throws IOException {
        ArrayList<String> nouns = new ArrayList<>(), verbs, adjectives;
        nouns = load("nouns.txt");
        verbs = load("verbs.txt");
        adjectives = load("adjectives.txt");
        Scanner input = new Scanner(new File("MadLib.txt"));
        int seed = input.nextInt();
        input.nextLine();
        Random rand = new Random(seed);
        while(input.hasNextLine()) {
            String sentance = input.nextLine();
            for (int i = 0; i < sentance.length(); i++) {
                if (sentance.charAt(i) == '#') {
                    sentance = sentance.replaceFirst("#", getRandom(nouns, rand));
                } else if (sentance.charAt(i) == '@') {
                    sentance = sentance.replaceFirst("@", getRandom(verbs, rand));
                } else if (sentance.charAt(i) == '&') {
                    sentance = sentance.replaceFirst("&", getRandom(adjectives, rand));
                }
            }
            System.out.println(sentance);
        }


    }




    public static ArrayList<String> load(String filename) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        Scanner input = new Scanner(new File(filename));
        while (input.hasNext())
            list.add(input.next());
        return list;
    }

    public static String getRandom(ArrayList<String> list, Random rand) {
        int number = rand.nextInt(list.size());
        String word = list.get(number);
        list.remove(number);
        return word;
    }
}
