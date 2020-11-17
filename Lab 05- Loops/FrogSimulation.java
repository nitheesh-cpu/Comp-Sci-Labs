import java.util.Random;

public class FrogSimulation {
    private int goalDistance;
    private int maxHops;
    private Random rand;

    public FrogSimulation(int dist, int numHops, int seed)
    {
        goalDistance = dist;
        maxHops = numHops;
        rand = new Random(seed);
    }

    public int hopDistance()
    {
        int x = rand.nextInt(goalDistance/maxHops*4);
        if(rand.nextInt(5) == 0)
            x = -x;
        return x;
    }

    public boolean simulate()
   {
       // Part A
       int pos = 0;
       for (int count = 0; count < maxHops; count++)
       {
           pos += hopDistance();
           if (pos >= goalDistance)
           {  
               return true;
           }
           else if (pos < 0)
           {
               return false;
        }
           }
       return false;
   }
    public double runSimulations(int num)
   {
       // Part B
       int times = 0;
    for(int count = 0; count < num; count++)
    {
       if(simulate())
       {
       times++;
       }
   }
    return (double)times/ num;
   }
}
