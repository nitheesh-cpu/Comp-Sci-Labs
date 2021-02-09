import java.util.Scanner;

public class WordSearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int repeat = input.nextInt();
        String[] words = new String[repeat];
        for (int i = 0; i < repeat; i++) {
            words[i] = input.next();
        }
        String temp = "";
        for (int i = 0; i < repeat; i++) {
            for (int j = i + 1; j < repeat; j++) {
                if (words[i].compareTo(words[j]) > 0) {
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        System.out.println("The array is");
        for(String x: words) System.out.print(x + " ");;
    }
}
