import java.util.*;
import java.io.*;
public class GetNeighbors {
    public static void main(String args[]) throws Exception{
        Scanner input = new Scanner(new File("GetNeighbors.txt"));
        int row = input.nextInt(), col = input.nextInt(), seed = input.nextInt();
        int[][] house = new int[row][col];
        Random rand = new Random(seed);
        for( int i = 0; i < house.length; i++)
            for(int j = 0; j < house[i].length; j++)
                house[i][j] = rand.nextInt(1000) + 1 ;
        for( int i = 0; i < house.length; i++) {
            for(int j = 0; j < house[i].length; j++)
                System.out.print(house[i][j] + " ");
            System.out.println();
        }
        int row1, col1;
        while(input.hasNextLine()) {
            row1 = input.nextInt();
            col1 = input.nextInt();
            int numOfRow = house.length;
            int numOfCol = house[0].length;
            if( row1 > -1 && row1 < numOfRow && col1 > -1 && col1 < numOfCol)
                System.out.println("Requested neighbors for element at row " + row1 + ", " + "col " + col1 + " (" + house[row1][col1] + ")");
            else
                System.out.println("Requested neighbors for element at row " + row1 + ", " + "col " + col1 + " (-1)");
            if(row1 -1 > -1 && row1 - 1 < numOfRow && col1 > -1 && col1 < numOfCol)
                System.out.print("North " + house[row1 - 1][col1]);
            else
                System.out.print("North -1");
            if(row1 + 1 < numOfRow && row1 + 1 > -1 && col1 > -1 && col1 < numOfCol)
                System.out.print(", South " + house[row1 + 1][col1]);
            else
                System.out.print(", South -1");
            if(col1 + 1 < numOfCol && col1 + 1 > -1 && row1 > -1 && row1 < numOfRow)
                System.out.print(", East " + house[row1][col1 + 1]);
            else
                System.out.print(", East -1");
            if(col1 - 1 > -1 && col1 - 1 < numOfCol && row1 > -1 && row1 < numOfRow)
                System.out.print( ", West " + house[row1][col1 - 1]);
            else
                System.out.print(", West -1");
            System.out.println();
        }
    }
}


