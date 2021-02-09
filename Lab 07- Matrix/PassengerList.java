import java.util.Scanner;
import java.io.*;
public class PassengerList {

    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(new File("PassengerList.txt"));
        String[][] passengerList = new String[10][6];
        while(input.hasNextLine()){
            System.out.println("Enter a seat row to reserve, negative 1 to quit");
            int row = input.nextInt();
            System.out.println("Enter a seat column to reserve");
            int col = input.nextInt();
            System.out.println("Enter passenger name");
            String blank = input.nextLine(), name = input.nextLine();
            if(row == -1) break;
            else if(row < 0  || col < 0 || row > 9 || col > 5 || passengerList[row][col] != null)
                System.out.println("Invalid row, seat value");
            else if(passengerList[row][col] == null)
                passengerList[row][col] = "[" + row+ "," + col + "  " + name + "]";
        }
        for(int i = 0; i < 10; i++){
            for(int x = 0; x < 6; x++){
                if(passengerList[i][x] == null) passengerList[i][x] = "[" + i+ "," + x + " empty]";
                System.out.printf("%20s", passengerList[i][x]);
            }System.out.println();
        }
    }
}
