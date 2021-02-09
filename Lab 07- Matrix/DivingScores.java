import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class DivingScores {
    public static void main(String args[])throws IOException {
        Scanner DiveDifficulty = new Scanner(new File("src/DiveDifficulty.txt"));
        Scanner Divers = new Scanner(new File("src/Divers.txt"));
        Scanner DivingScores = new Scanner(new File("src/DivingScores.txt"));
        Scanner Judges = new Scanner(new File("src/Judges.txt"));
        String judge[] = new String[7];
        String diver[] = new String[4];
        double diveDifficulty[] = new double[4];
        double diverScore[][] = new double[4][7];
        for (int i = 0; i < 4; i++) diver[i] = Divers.nextLine();
        for (int i = 0; i < 4; i++) diveDifficulty[i] = DiveDifficulty.nextDouble();
        for (int i = 0; i < 7; i++) judge[i] = Judges.nextLine();
        for (int i = 0; i < 7; i++) { for (int x = 0; x < 4; x++) diverScore[x][i] = DivingScores.nextDouble();}
        String judgesList = "[";
        for(String judges : judge) judgesList += judges + ", ";
        judgesList = judgesList.substring(0, judgesList.length()-2) + "]";
        out.println("Judges:\n" + judgesList);
        String diversList = "[";
        for(String divers : diver) diversList += divers + ", ";
        diversList = diversList.substring(0, diversList.length()-2) + "]";
        out.println("Divers:\n" + diversList);
        String difficultyList = "[";
        for(double difficulties : diveDifficulty) difficultyList += difficulties + ", ";
        difficultyList = difficultyList.substring(0, difficultyList.length()-2) + "]";
        out.println("Dive Difficulty:\n" + difficultyList);
        findSmallest(diverScore);
        findLargest(diverScore);
        out.println("Diver's Scores:");
        for(int i = 0; i<4 ; i++){
            out.println(diver[i]);
            for(int x = 0; x < 7; x++) out.print(diverScore[i][x] + " ");
            out.print("difficulty: " + diveDifficulty[i] + "\n"); }
        double[] calcScores = calcScore(diverScore,diveDifficulty);
        awardMedal(calcScores,diver);
    }

    public static void findSmallest(double mat[][])
    {
        for(int i = 0; i < 4 ; i++){
            double small = 99.9;
            int pos= -1;
            for(int x = 0; x < 7; x++)
                if(mat[i][x] < small){
                    small = mat[i][x];
                    pos = x; }
            mat[i][pos]=0.0; }
    }

    public static void findLargest(double mat[][])
    {
        for(int i = 0; i < 4 ; i++){
            double small = 0.0;
            int pos= -1;
            for(int x = 0; x < 7; x++)
                if(mat[i][x] > small){
                    small = mat[i][x];
                    pos = x; }
            mat[i][pos]=0.0; }
    }

    public static double[] calcScore(double mat[][], double dif[])
    {
        double[] calcScores = new double[4];
        for(int i = 0; i<4; i++){
            double sum = 0.0;
            for(int x = 0; x < 7; x++)
                sum += mat[i][x];
            sum*=dif[i];
            calcScores[i] = sum; }
        return calcScores;
    }

    public static void awardMedal(double[] scores, String[] divers)
    {
        //Determine winners here
        for(int i = 0; i<4; i++){
            double small = 0.0;
            int pos = -1;
            for(int x = i; x<4; x++)
                if (scores[x] > small) {
                    small = scores[x];
                    pos = x; }
            String tempString = divers[i];
            double tempDouble = scores[i];
            divers[i] = divers[pos];
            scores[i] = scores[pos];
            divers[pos] = tempString;
            scores[pos] = tempDouble; }
        //use these lines to print winners
        out.println("Results");
        out.printf("%-20s %6.2f gold\n",divers[0],scores[0]);
        out.printf("%-20s %6.2f silver\n",divers[1],scores[1]);
        out.printf("%-20s %6.2f bronze\n",divers[2],scores[2]);
    }
}
