import java.io.*;
import java.util.Scanner;
import static java.lang.System.*;

public class DigitsDriver {
	public static void main(String args[]) throws IOException
	{
		Scanner input = new Scanner(new File("Digits.txt"));
		while(input.hasNext()){
			int k = input.nextInt();
			Digits x = new Digits(k);
			out.println(k+" isStrictlyIncreasing? "+x.isStrictlyIncreasing());
		}
	}
}
