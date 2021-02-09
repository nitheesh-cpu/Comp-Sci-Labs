import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FizzBuzz{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner((new File("FizzBuzz.txt")));
        int numOfValues = in.nextInt();
        int m = 0;
        int i = 0;
        while (i<numOfValues) {
            m = in.nextInt();
            if (((m % 3) == 0) && ((m % 5) == 0))
                System.out.println((m + "\t" + "FizzBuzz"));
            else if ((m % 3) == 0)
                System.out.println((m + "\t" + "Fizz"));
            else if ((m % 5) == 0)
                System.out.println((m + "\t" + "Buzz"));
            else
                System.out.println((m + "\t" + m));
            i++;
        }
    }
}
