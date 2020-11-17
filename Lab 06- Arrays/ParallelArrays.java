import java.util.Scanner;
import java.io.*;
public class  {

    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(new File("parallel.txt"));
        int run = input.nextInt();
        String[] wordArray = new String[run];
        int[] numArray = new int[run];
        for(int i = 0; i < run; i++){
            wordArray[i] = input.next();
            numArray[i] = input.nextInt();
        }
        int repeat = 0;
        for(int i = 0; i < run; i++){
            while(repeat<numArray[i]){
                System.out.print(wordArray[i] + " ");
                repeat++;
            }repeat = 0;
            System.out.println();
        }
    }
}
