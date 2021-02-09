import java.util.Scanner;

public class MatrixCrypt {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String phrase = input.nextLine(), encrypted = "";
        double length = Math.sqrt(phrase.length());
        int x, y = 0, pos = 0;
        if (length - (int) length == 0) {
            x = (int) length;
            y = (int) length;
        } else {
            length = (int) (length - (length - (int) length));
            x = (int) length;
            for (int i = (int) length; i < 99; i++)
                if (i * length >= phrase.length()) {
                    y = i;
                    break;
                }
        }
        char[][] crypt = new char[x][y];
        for (int i = 0; i < x; i++)
            for (int o = 0; o < y; o++) {
                if (pos > phrase.length() - 1) crypt[i][o] = 'X';
                else crypt[i][o] = phrase.charAt(pos);
                pos++;
            }
        for (int i = 0; i < y; i++)
            for (int o = 0; o < x; o++)
                encrypted += crypt[o][i];
        System.out.println(phrase + " ==> " + encrypted);
    }
}
