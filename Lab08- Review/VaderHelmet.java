import java.util.Scanner;
import java.io.*;
public class VaderHelmet {

    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(new File("VaderHelmet.txt"));
        int rows = input.nextInt();
        int cols = input.nextInt();
        String[][] toyShelf = new String[rows][cols];
        input.nextLine();
        while(input.hasNextLine()){
            String toy = input.nextLine();
            if(toy.charAt(0)>=65&&toy.charAt(0)<=70){
                outerloop:
                for(int r = 0; r < toyShelf.length; r++)
                    for(int c = 0; c < toyShelf[0].length; c++)
                        if(toyShelf[r][c]==null){
                            toyShelf[r][c] = toy;
                            break outerloop;
                        }
            }
            else if(toy.charAt(0)>=81&&toy.charAt(0)<=90){
                outerloop:
                for(int r = toyShelf.length-1; r >= 0; r--)
                    for(int c = toyShelf[0].length-1; c >= 0; c--)
                        if(toyShelf[r][c]==null){
                            toyShelf[r][c] = toy;
                            break outerloop;
                        }
            }
            else if(toy.charAt(0)>=71&&toy.charAt(0)<=75){
                outerloop:
                for(int c = 0; c < toyShelf[0].length; c++)
                    for(int r = toyShelf.length-1; r >= 0; r--)
                        if(toyShelf[r][c]==null){
                            toyShelf[r][c] = toy;
                            break outerloop;
                        }
            }
            else if(toy.charAt(0)>=76&&toy.charAt(0)<=80){
                outerloop:
                for(int c = toyShelf[0].length-1; c >= 0; c--)
                    for(int r = 0; r < toyShelf.length; r++)
                        if(toyShelf[r][c]==null){
                            toyShelf[r][c] = toy;
                            break outerloop;
                        }
            }
        }
        for (String[] strings : toyShelf) {
            for (int c = 0; c < toyShelf[0].length; c++) {
                System.out.print(strings[c] + ".");
            }
            System.out.println();
        }

    }
}
