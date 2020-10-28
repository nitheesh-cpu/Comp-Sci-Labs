import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;
public class Main {
    public static void main(String args[])
    {
        // finish the main method
        double velocity;
        double angle;
        double distance;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the velocity:");
        velocity = input.nextDouble();
        System.out.println("Please enter the angle:");
        angle = input.nextDouble();

        distance = calculateDistance(velocity, angle);
        out.println(String.format("distance = %.3f meters", distance));
    }

    public static double calculateDistance(double v, double a)
    {
        double velocity = (v*v);
        double theta = 2 * a;
        double radian = Math.toRadians(theta);
        double sin = Math.sin(radian);
        double third = velocity*sin;
        double distance = third/9.81;

        return distance;
    }
}