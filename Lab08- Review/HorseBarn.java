import java.io.*;
import java.util.*;
public class HorseBarn {
    private static String[] barn;
    public static void main(String args[])throws IOException
    {
        Scanner input = new Scanner(new File ("HorseBarn.txt"));
        int count = input.nextInt();
        barn = new String[count];
        input.nextLine();
        for(int i = 0; i < count; i++){
            barn[i] = input.nextLine();
        }
        printBarn(barn);
    }

    public static void reorderBarn(String[] barn)
    {
        for(int i = 0; i < barn.length; i++){
            if(barn[i].equals(""))
            for(int j = i; j < barn.length; j++){
                if(!barn[j].equals("")){
                    String temp = barn[j];
                    barn[i]=temp;
                    barn[j]="";
                    break;
                }
            }
        }
    }

    public static void printBarn(String[] barn)
    {
        System.out.println("Original Barn Order:");
        for(int i = 1; i <= barn.length; i++){
            if(barn[i-1].equals(""))
                System.out.println("Stable " + i + ": EMPTY" );
            else System.out.println("Stable " + i + ": " + barn[i-1]);
        }
        reorderBarn(barn);
        System.out.println("Reordered Barn:");
        for(int i = 1; i <= barn.length; i++){
            if(barn[i-1].equals(""))
                System.out.println("Stable " + i + ": EMPTY" );
            else System.out.println("Stable " + i + ": " + barn[i-1]);
        }

    }
}
