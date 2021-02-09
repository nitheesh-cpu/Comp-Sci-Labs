import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(new File("ArrayListPractice.txt"));
        int individualNumbers = input.nextInt();
        for(int i = 0; i < individualNumbers; i++){
            int num = input.nextInt();
            ArrayList<Integer> compositeNums = new ArrayList<>();
            for(int j = 2 ; j < num ; j++)
                if(num%j == 0)
                    compositeNums.add(j);
            System.out.println(compositeNums);
        }
        ArrayList<Integer> list = new ArrayList<Integer>(), composite = new ArrayList<>();
        while(input.hasNextInt())
            list.add(input.nextInt());
        System.out.println("Original List\n"+list);
        for(int i = 0; i < list.size(); i++)
            for(int j = 2; j < list.get(i); j++)
                if(list.get(i)%j == 0){
                    composite.add(list.get(i));
                    break;
                }
        System.out.println("Composite List\n" + composite);


    }
}
