import static java.lang.System.*;
import java.util.Scanner;

public class FrogSimulationDriver {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        out.println("Enter distance");
        int distance = input.nextInt();
        out.println("Enter maximum number of hops");
        int maxHops = input.nextInt();
        out.println("Enter the random seed value");
        int seed = input.nextInt();
        out.println("Enter the number of simulations");
        int numSim = input.nextInt();
        input.close();
        FrogSimulation testSubject = new FrogSimulation(distance,maxHops,seed);
        double pct = testSubject.runSimulations(numSim);

        out.println("After "+numSim+" simulations, the frog succeeds "+pct+" of the time.");
    }
}
