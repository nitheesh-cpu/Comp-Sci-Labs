import java.util.Scanner;
import static java.lang.System.*;

public class Resize {
    private static double startingHeight;
    private static double startingWidth;
    private static double endingHeight;
    private static double endingWidth;
    public static void main(String args[])
    {
        //Finish the main method
        Scanner input = new Scanner(System.in);

        double actualWidth;
        double actualHeight;
        out.println("Enter in original height then width");
        startingHeight = input.nextDouble();
        startingWidth = input.nextDouble();
        out.println("Enter in the desired height and width");
        endingHeight = input.nextDouble();
        endingWidth = input.nextDouble();
        actualWidth = getWidth(startingHeight, startingWidth, endingHeight);
        out.println(String.format("%.2f",endingHeight) +" by "+ String.format("%.2f",actualWidth) +" or ");
        actualHeight = getHeight(startingHeight, startingWidth, endingWidth);
        out.println(String.format("%.2f",actualHeight) +" by "+ String.format("%.2f",endingWidth));
        
    }
    public static double getWidth(double startingHeight, double startingWidth, double endingHeight){
        return ((startingWidth*endingHeight)/startingHeight);
    }
    public static double getHeight(double startingHeight, double startingWidth, double endingWidth){
        return ((startingHeight*endingWidth)/startingWidth);
    }
    // Write the two methods
}
