import java.util.*;
import static java.lang.System.*;
import java.io.*;

public class MultPracticeDriver {
	public static void main(String args[]) throws IOException
	{
		Scanner input = new Scanner(new File("MultPractice.txt"));
		ArrayList<MultPractice> list = new ArrayList<>();
		while(input.hasNext())
		{
			list.add(new MultPractice(input.nextInt(),input.nextInt()));
		}
		
		for(MultPractice k:list)
		{
			MultPractice temp = k;
			out.println(k.getProblem());
			k.nextProblem();
			out.println(k.getProblem());
			k.nextProblem();
			out.println(k.getProblem());
			out.println(k.getProblem());
			out.println(k.getProblem());
			k.nextProblem();
			k.nextProblem();
			out.println(k.getProblem());
			k.nextProblem();
			out.println(k.getProblem());
			out.println(k.getProblem());
			k.nextProblem();
			k.nextProblem();
			k.nextProblem();
			k.nextProblem();
			out.println(k.getProblem());			
		}
	}
}
