import java.util.Scanner;
public class Extremes {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of random values you want:");
        int amount = input.nextInt();
        System.out.println("Enter the smallest value:");
        int min = input.nextInt();
        System.out.println("Enter the largest value:");
        int max = input.nextInt();
        int i = 0;
        int big = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        while(amount!=i){
            int random = input.nextInt();
            if(random < small){
                small = random;
            }
            if(random > big){
                big = random;
            }
            i++;
        }
        System.out.println("The largest number is: " + big);
        System.out.println("The smallest number is: " + small);
    }
}
