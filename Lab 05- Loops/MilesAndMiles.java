import java.util.Scanner;
import java.io.File;
public class MilesAndMiles {

    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(new File("MilesAndMiles.txt"));
        boolean repeat = true;
        double finalMiles, gallons, milesPerG = 0;
        for(int i = 0; i != -1; i++){
            System.out.println("Initial miles:");
            double initial = input.nextDouble();
            if(initial < 0){
                repeat = false;
                break;
            }
            System.out.println("Final miles:");
            finalMiles = input.nextDouble();
            System.out.println("Gallons:");
            gallons = input.nextDouble();
            milesPerG = (finalMiles-initial)/gallons;
            System.out.println("Miles per Gallon: " + milesPerG + "\n");

        }
        System.out.println("Bye");
    }
}
