import java.util.*;

public class RandomNumbers {

    public static void main(String[] args){
        System.out.println("Enter seed");
        Scanner input = new Scanner(System.in);
        int seeed = input.nextInt();
        double[] array = new double[25];
        Random rand = new Random(seeed);
        double sum = 0.0;
        for(int i = 0; i < 25; i++) {
            double double_random = Math.round(rand.nextDouble() * 1000.0) / 1000.0;
            sum += double_random;
            array[i]=double_random;
            System.out.println(double_random);
        }
        System.out.println("Average = " + Math.round((sum/25) * 1000.0) / 1000.0);
    }
}
