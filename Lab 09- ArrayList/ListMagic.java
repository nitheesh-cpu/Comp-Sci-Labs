import java.io.*;
import java.util.*;

public class ListMagic {
    public static void main(String args[]) throws IOException
    {
        Scanner input = new Scanner(new File("ListMagic.txt"));
        ArrayList<String> stringList = new ArrayList<>();
        while(true){
            System.out.println("Enter word, enter quit to end");
            String word = input.next();
            if(word.equalsIgnoreCase("Quit")) break;
            stringList.add(word);
        }
        Collections.sort(stringList);
        ArrayList<Integer> integerList = new ArrayList<>();
        while(true){
            System.out.println("Enter num, enter negative num to end");
            int num = input.nextInt();
            if(num == -1) break;
            integerList.add(num);
        }
        System.out.println(stringList);
        System.out.println(maxLength(stringList));
        removeDuplicates(stringList);
        switchPairs(stringList);
        System.out.println(integerList);
        System.out.println(range(integerList));
        System.out.println("Enter element, starting index, and ending index");
        int element = input.nextInt(), start = input.nextInt(), stop = input.nextInt();
        removeInRange(integerList, element, start, stop);
    }

    public static int maxLength(ArrayList<String> list)
    {
        int big = 0;
        if(list.isEmpty()) return 0;
        for (String s : list) {
            if (s.length() > big)
                big = s.length();
        }
        return big;
    }

    public static void removeDuplicates(ArrayList<String>list)
    {
        for(int i = 0; i < list.size(); i++)
            for(int j = 0; j < list.size(); j++)
                if(list.get(i).equals(list.get(j)) && i!=j) {
                    list.remove(j);
                    j--;
                }
        System.out.println(list);
    }

    public static int range(ArrayList<Integer> list)
    {
        int small = Integer.MAX_VALUE, big = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i ++){
            if(list.get(i) > big) big = list.get(i);
            if(list.get(i) < small) small = list.get(i);
        }
        return big-small+1;
    }

    public static void switchPairs(ArrayList<String>list)
    {
        for(int i = 1; i < list.size(); i+=2){
            String temp = list.get(i);
            list.remove(i);
            list.add(i-1, temp);
        }
        System.out.println(list);
    }

    public static void removeInRange(ArrayList<Integer> list, int val, int start, int stop)
    {
        for(int i = stop; i >= start; i--){
            if(list.get(i)==val)list.remove(i);
        }
        System.out.println(list);
    }
}
