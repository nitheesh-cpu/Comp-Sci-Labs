import java.util.Scanner;
import java.io.File;
import java.util.stream.IntStream;
public class  {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new File("GrowingNumbers.txt"));
        for(int o = 0; o < 8; o++) {
            int count = input.nextInt(), number = count, n = 0, sum = 0;
            while (count != 0) {
                count /= 10;
                n++;
            }
            int[] array = new int[n];
            if(number<10){
                System.out.println("["+number+"] is strictly increasing. The total is " + number);
            }else {
                String numbers = "";
                for (n -= 1; n >= 0; n--) {
                    int digit = number % 10;
                    number /= 10;
                    array[n] = digit;
                    numbers = array[n] + "," + numbers;
                }
                sum = IntStream.of(array).sum();
                numbers = "[" + numbers.substring(0, numbers.length() - 1) + "]";
                System.out.print(numbers);
                n = array.length;
                if (array[0] <= array[1] && array[1] < array[2] && array[n - 2] <= array[n - 1])
                    System.out.print(" is strictly increasing. The total is " + sum);
                else
                    System.out.print(" is NOT strictly increasing. The total is " + sum);
                System.out.println();
            }
        }
    }
}
