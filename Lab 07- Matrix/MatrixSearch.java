import java.util.Random;
import java.util.Scanner;
import java.io.*;
public class MatrixSearch {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(new  File("MatrixSearch.txt"));
        int seed = input.nextInt(), rows = input.nextInt(), cols = input.nextInt();
        Random rn = new Random(seed);
        int[][] mat = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for (int o = 0; o < cols; o++) {
                mat[i][o] = rn.nextInt(100)+1;
                System.out.print(mat[i][o] + " ");
            }
            System.out.println();
        }
        while(input.hasNextInt()){
            int find = input.nextInt(), x = 0, y = 0;
            boolean found = false;
            outerloop:
            for(int i = 0; i < rows; i++) {
                for (int o = 0; o < cols; o++) {
                    if(mat[i][o] == find){
                        found = true;
                        System.out.println(find + " is at [" + i + "," + o + "]");
                        break outerloop;
                    }
                }
            }
            if(!found) System.out.println(find + " is not in matrix");
        }
    }
}
