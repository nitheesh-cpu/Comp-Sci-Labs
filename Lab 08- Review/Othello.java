import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class Othello {
    public static void main(String args[]) throws IOException
    {
        Scanner input = new Scanner(new File("Othello.txt"));
        Character[][] game = new Character[8][8];
        for(int r=0; r<game.length; r++)
        {	String temp = input.next();
            for(int c=0; c<game[0].length; c++)
                game[r][c] = temp.charAt(c);
        }
        print(game);
        int r, c;
        Character token;
        while(input.hasNext())
        {
            r = input.nextInt();
            c = input.nextInt();
            token = input.next().charAt(0);
            out.println("Move "+r+","+c+":"+token);
            game[r][c]=token;
            north(game, r, c, token);
            northeast(game, r, c, token);
            east(game, r, c, token);
            southeast(game, r, c, token);
            south(game, r, c, token);
            southwest(game, r, c, token);
            west(game, r, c, token);
            northwest(game, r, c, token);
            print(game);
        }
        score(game);
    }
    private static void print(Character[][] game){
        for (Character[] characters : game) {
            for (int column = 0; column < game[0].length; column++) 
                out.print(characters[column]);
            out.println();
        }
    }

    private static void score(Character[][] game){
        int wCount = 0, bCount = 0;
        for(int r = 0; r < game.length; r++)
            for(int c = 0; c < game[r].length; c++){
                if(game[r][c] == 'W') wCount++;
                if(game[r][c] == 'B') bCount++;
            }
        if(wCount>bCount) out.println("WHITE WINS " + wCount + " to " + bCount);
        if(bCount>wCount) out.println("BLACK WINS " + bCount + " to " + wCount);
    }



    private static void west(Character[][] game, int r, int c, Character token) {
        int cTokn ;
        for (int col = c-1; col >=0; col--) {
            if (game[r][col] == 'E') break;
            if (game[r][col] == token) {
                cTokn = col;
                for (int col2 = c; col2 > cTokn; col2--)
                    game[r][col2] = token;
                break;
            }
        }
    }

    private static void southwest(Character[][] game, int r, int c, Character token) {
        int rTokn, cTokn;
        for (int row = r+1, col = c-1; row < 8 && col >= 0 ; row++, col--) {
            if (game[row][col] == 'E') break;
            if (game[row][col] == token) {
                rTokn = row;
                cTokn = col;
                for(int row2 = r,col2 = c; row2 < rTokn && col2 > cTokn; row2++,col2--)
                    game[row2][col2] = token;
                break;
            }
        }
    }

    private static void south(Character[][] game, int r, int c, Character token) {
        int rTokn;
        for(int row = r+1; row < 8; row++){
            if (game[row][c] == 'E') break;
            if(game[row][c] == token){
                rTokn = row;
                for(int row2 = r; row2 < rTokn; row2++)
                    game[row2][c] = token;
                break;
            }
        }
    }

    private static void southeast(Character[][] game, int r, int c, Character token) {
        int rTokn, cTokn;
        for(int row = r+1, col = c+1; row < 8 && col < 8; row++,col++){
            if(game[row][col] == 'E') break;
            if(game[row][col] == token){
                rTokn = row;
                cTokn = col;
                for(int row2 = r, col2 = c; row2 < rTokn && col2 < cTokn; row2++,col2++)
                    game[row2][col2] = token;
                break;
            }
        }
    }

    private static void east(Character[][] game, int r, int c, Character token) {
        int cTokn;
        for (int col = c + 1; col < 8; col++) { //Find token in the East direction
            if (game[r][col] == 'E') break;
            if (game[r][col] == token) {
                cTokn = col;
                for(int col2 = c; col2 < cTokn; col2++)
                    game[r][col2] = token;
                break;
            }
        }
    }

    private static void northeast(Character[][] game, int r, int c, Character token) {
        int rTokn, cTokn;
        for(int row = r-1, col = c+1; row >= 0 && col < 8; row--,col++){
            if (game[row][col] == 'E') break;
            if(game[row][col] == token){
                rTokn = row;
                cTokn = col;
                for(int row2 = r, col2 = c; row2 > rTokn && col2 < cTokn; row2--,col2++)
                    game[row2][col2] = token;
                break;
            }
        }
    }

    private static void north(Character[][] game, int r, int c, Character token) {
        int rTokn;
        for (int row = r-1; row >=0; row--) {
            if (game[row][c] == 'E') break;
            if (game[row][c] == token) {
                rTokn = row;
                for(int row2 = r; row2 > rTokn; row2--)
                    game[row2][c] = token;
                break;
            }
        }
    }

    private static void northwest(Character[][] game, int r, int c, Character token) {
        int rTokn, cTokn;
        for(int row = r-1, col = c-1; row >= 0 && col >= 0; row--,col--){
            if(game[row][col] == 'E') break;
            if(game[row][col] == token){
                rTokn = row;
                cTokn = col;
                for(int row2 = r, col2 = c; row2 > rTokn && col2 > cTokn; row2--,col2--)
                    game[row2][col2] = token;
                break;
            }
        }
    }
}
