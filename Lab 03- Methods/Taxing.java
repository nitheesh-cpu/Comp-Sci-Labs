import java.util.Scanner;
import static java.lang.System.*;

public class Taxing {
    public static void main(String args[])
    {
        //Complete main method
        double total;
        double purchase;
        Scanner input = new Scanner(System.in);
        out.println("Enter the purchase amount");
        purchase = input.nextDouble();
        total = getTotal(purchase);
        out.println(String.format("$%.2f",total));
    }

    public static double getTotal(double p)
    {
        double tax = .0825;
        double taxPayed = p * tax;
        double total = p + taxPayed;
        return total;
    }
}
