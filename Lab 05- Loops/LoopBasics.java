import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class LoopBasics {
	public static void main(String args[])throws IOException
	{
		Scanner input = new Scanner(new File("LoopBasics.txt"));
		int sets; //number of sets per method call
		sets = input.nextInt();
		while(sets>0)
		{
			method1(input.nextInt(), input.nextInt(), input.nextInt());
			sets--;
		}
		sets = input.nextInt();
		while(sets>0)
		{
			out.println(factorial(input.nextInt()));
			sets--;
		}
		method2(input.nextInt(),input.next());
		out.println(backwards(input.next()));
		method4(input);
		method5(input.nextInt());
		out.println(accumulate(input.nextInt(),input.nextInt()));
		method7(input.next());
		method8(input.next(),input.next());
	}
	
	//write method1 here
	public static void method1(int a, int b, int c){
	    if (a < b){
	        for (int i = a; i <= b; i+=c){
	            out.print(i+" ");
	        }
	    }
	    if (b < a){
	        for (int i = a; i >=b; i-=c){
	            out.print(i+" ");
	        }
	    }
	    out.println();
	}
	//write factorial method here
	public static int factorial(int a){
	    if (a == 0) return 1;
	    else return a * factorial(a-1);
	}
	//write method2 here
	public static void method2(int a, String b){
	    for (int i = 0; i < a; i++){
	        System.out.print(b+" ");
	    }
	    out.println();
	}
	//write backwords method here
	public static String backwards(String s){
	    String r = "";
	    for (int i = s.length()-1; i >= 0; i--) r += s.charAt(i);
	    return r;
	}
	//write method4 here
	public static void method4(Scanner input){
	    String s = input.next();
	    while (!s.equals("STOP")){
	        System.out.println(s);
	        s = input.next();
	    }
	}
	//write method5 here
	public static void method5(int a){
	    Random Rand = new Random(a);
	    while (true){
	        int x = (int)(Rand.nextInt(16));
	        if (x == 7) {System.out.println(); return;}
	        System.out.print(x + " ");
	    }
	}
	//write accumulate method here
	public static int accumulate(int a, int b){
	    int sum = 0;
	    if (a < b){
	        for (int i = a; i <= b; i++){
	            sum += i;
	        }
	    }
	    else if (a > b){
	        for (int i = b; i <= a; i--){
	            sum += i;
	        }
	    }
	    return sum;
	}
	//write md7 here
	public static void method7(String a){
	    String s = a;
	    for (int i = 1; i <= a.length(); i++){
	        System.out.println(s);
	        s = a.substring(i);
	    }
	}
	//write metho8 here
	public static void method8(String a, String b){
	    int x = 50 - (a.length() + b.length());
	    System.out.print(a);
	    for (int i = 0; i < x; i++) System.out.print("X");
	    System.out.println(b);
	}
}
