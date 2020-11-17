import java.util.Scanner;
import java.io.*;
public class Average {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new File("Average.txt"));
        System.out.println("Please enter the number of values");
        int numOfValues = input.nextInt();
        int[] average = new int[numOfValues];
        for(int i = 0; i < numOfValues; i++){
            System.out.println("Please enter the value");
            int number = input.nextInt();
            average[i] = number;
        }
        System.out.println("The array is");
        double sum = 0;
        for(int i = 0; i < numOfValues; i++){
            System.out.print(average[i] + " ");
            sum += average[i];
        }
        sum = sum/numOfValues;
        System.out.print("The average is " + sum);

    }
}
