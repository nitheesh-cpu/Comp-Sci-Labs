import java.io.*;
import java.util.*;

public class ShuffleDeck {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("ShuffleDeck.txt"));
        System.out.println("Enter the seed");
        int seed = input.nextInt(), min = 1;
        Random generator = new Random(seed);
        System.out.println("Enter N");
        int max = input.nextInt();
        ArrayList<Integer> List = new ArrayList<>();
        for(int i = 0; i < max; i++)
            List.add(i+1);
        for(int i = 0; i < max; i++){
            int rand = generator.nextInt(max);
            Collections.swap(List,i,rand);
        }
        System.out.println(List);
    }
}
