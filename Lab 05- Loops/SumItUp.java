import java.util.*;
import java.io.*;
public class SumItUp {
    public static void main(String[] args)throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N:");
        int num = input.nextInt();
        double sum = 0.0;
        for(int i = 1; i <= num; i++){
            sum += 1.0/i;
        }
        System.out.println("Sum is: " + String.format("%.4f", sum));

    }
}
