import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Mortgage {
    public static void main(String args[])throws IOException
    {
        Scanner input = new Scanner(System.in);
        out.println("Enter loan amount:");
        double P = input.nextDouble();
        out.println("Enter nominal annual interest rate:");
        double r = input.nextDouble()/12;
        out.println("Enter number of years for loan:");
        int n = input.nextInt()*12;
        amortiziationScheduleHeader(P);
        double amountPerPeriod = (P*r*Math.pow(1+r,n))/(Math.pow(1+r,n)-1);
        double lastPayed = P, interest = 0.0,principal = 0.0, totalInterest = 0.0;
        for(int i = 1; i <= (double)n/25;i++){
            for(int q = 0; q<25; q++) {
                interest = lastPayed * r;
                totalInterest+=interest;
                principal = amountPerPeriod-interest;
                lastPayed-=principal;
            }
            amortiziationScheduleLine(i*25,amountPerPeriod,interest,principal,lastPayed);
        }
        for(int q=0; q<n%25;q++){
            interest = lastPayed * r;
            totalInterest+=interest;
            principal = amountPerPeriod-interest;
            lastPayed-=principal;
        }
        amortiziationScheduleLine(n,amountPerPeriod,interest,principal,0.0);

        out.printf("\nAmount of interest paid $%,.2f\n",totalInterest);
    }

    // Prints out the amortiziation schedule header -- do this only once
    public static void amortiziationScheduleHeader(double b)
    {
        out.printf("%s%7s%9s%10s%12s\n%,45.2f\n","Payment","Amount","Interest","Principal","Balance",b);
    }

    // Prints out the amortiziation schedule per line -- call this in a loop
    public static void amortiziationScheduleLine(int x, double a, double b, double c, double d)
    {
        out.printf("%4d%,10.2f%,9.2f%,10.2f%,12.2f\n", x,a,b,c,d);
    }
}
