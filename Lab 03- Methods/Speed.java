import java.util.Scanner;
import static java.lang.System.*;

public class Speed {
    public static void main(String args[])
    {
        double miles;
        int seconds;
        Scanner input = new Scanner(System.in);
        out.println("Enter the number of seconds");
        seconds = input.nextInt();
        miles = calculateDistance(seconds);
        System.out.println(String.format("%.3f", miles));
    }

    public static double calculateDistance(int s)
    {
        double miles = s * 0.21313;
        return miles;
    }

}
