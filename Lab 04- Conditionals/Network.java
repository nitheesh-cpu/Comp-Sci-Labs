import java.util.*;
import static java.lang.System.*;

public class Network {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        String x;
        int choice;

        out.println("Enter log message:");
        x = input.nextLine();
        out.println("Choose from the following\n1.The full String\n2.The machine ID\n3.The description.");
        choice = input.nextInt();
        out.println(getChoice(choice, x));
        out.println();
    }

    public static String getChoice(int choice, String x){
        if(choice == 1){
            return "The full String:" + x;
        }else if(choice == 2){
            return "The machine ID:" + x.substring(0,x.indexOf(":"));
        }else if(choice == 3){
            return "The description:" + x.substring(x.indexOf(":")+1);
        }else{
            return "error";
        }
    }
}
