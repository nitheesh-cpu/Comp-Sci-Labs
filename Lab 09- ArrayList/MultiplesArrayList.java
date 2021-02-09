import java.io.*;
import java.util.*;
public class MultiplesArrayList {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("MultiplesArrayList.txt"));
        while(input.hasNext()) {
            int multipleValue = input.nextInt(), limitingValue = input.nextInt();
            printMultiplesOf(multipleValue, limitingValue);
        }
    }

    public static void printMultiplesOf(int muliple, int limit) {
        ArrayList<Integer> List = new ArrayList<Integer>();
        int count = 0, start = ((int) Math.ceil((double) 1 / muliple)) * muliple;
        int end = (limit / muliple) * muliple;
        for (int i = start; i <= end; i+= muliple) {
            List.add(i);
            count += i;
        }
        System.out.println(List + " = " + count);
    }
}
