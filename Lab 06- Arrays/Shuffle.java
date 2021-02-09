import java.util.Random;
import java.util.Scanner;

public class Shuffle {

    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        int value = 0, temp = 0;
        System.out.println("Enter seed value for Random");
        int seed = input.nextInt();
        Random rn = new Random(seed);
        int deck[] = new int[52];
        for (int i = 1; i <= 52; i++){
            deck[i-1] = i;
        }
        for(int i = 0; i < 52; i++){
            value = rn.nextInt(52);
            temp = deck[i];
            deck[i] = deck[value];
            deck[value] = temp;
        }
        for (int e: deck) System.out.print(e + " ");

    }
}
