import java.util.Scanner;
import java.io.*;

public class SieveEratosthenes {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new File("SieveEratosthenes.txt"));
        while(input.hasNextInt()) {
        int stop = input.nextInt();
        int array[] = new int[stop];
        String primes[] = new String[stop];
        int list[] = new int[stop];
            for (int i = 0; i < stop; i++) {
                primes[i] = "Pr";
                array[i] = i + 1;
                list[i] = 1;
            }
            primes[0] = "xx";

            for (int i = 3; i <= stop; i++) {
                for (int x = 2; x < i; x++) {
                    if (i % x == 0) {
                        primes[i - 1] = "NP";
                    }
                }
            }
            System.out.println("PRIMES BETWEEN 1 AND " + stop + "\n");
            int values = 0;
            for (int i = 1; i <= stop; i++) {
                if (primes[i - 1].equals("Pr")){
                    System.out.print(String.format("%5d", i));
                    values++;
                }
                if(values==15){
                    values=0;
                    System.out.println();
                }
            }
            System.out.println("\n");
        }
    }
}
