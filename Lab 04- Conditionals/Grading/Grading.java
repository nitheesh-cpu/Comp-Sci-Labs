import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Grading {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new File("Grading.txt"));
        int x;
        String y;

        while(input.hasNext())
        {
            x = input.nextInt();
            y = getGrade(x);
            out.println(x + " is " + y);
        }
    }

    public static String getGrade(int x){
        if(x >= 93){
            return "A";
        }else if(x >= 90){
            return "A-";
        }else if(x >= 87){
            return "B+";
        }else if(x >= 83){
            return "B";
        }else if(x >= 80){
            return "B-";
        }else if(x >= 77){
            return "C+";
        }else if(x >= 73){
            return "C";
        }else if(x >= 70){
            return "C-";
        }else if(x >= 67){
            return "D+";
        }else if(x >= 63){
            return "D";
        }else if(x >= 60){
            return "D-";
        }else {
            return "F";
        }
    }
}
