import java.util.*;
import static java.lang.System.*;

public class Network2 {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(in);
		String key, description;
		boolean outcome;
		
		key = input.nextLine();
		description = input.nextLine();
		outcome = find(description,key);
		out.println(outcome+" --> key: "+key+" description: "+description);
	}
	
    public static boolean find(String desc, String key){
        return (" " + desc + " ").contains(" " + key + " ");
    }
    
}
