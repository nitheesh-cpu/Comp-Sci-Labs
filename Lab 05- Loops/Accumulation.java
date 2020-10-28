import java.util.Scanner;
public class Accumulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("HOW MANY INTEGERS WILL BE ADDED:");
        int end = input.nextInt();
        int i = 0;
        int sum = 0;
        while(i != end){
            System.out.println("ENTER AN INTEGER:");
            int number = input.nextInt();
            sum += number;
            i++;
        } System.out.println("THE SUM IS " + sum);
    }
}
