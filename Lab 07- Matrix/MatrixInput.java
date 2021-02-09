import java.util.Scanner;

public class MatrixInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows, cols, count = 1;
        System.out.println("Enter the number of rows");
        rows = input.nextInt();
        System.out.println("Enter the number of cols");
        cols = input.nextInt();
        int[][] mat = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int x = 0; x < cols; x++){
                mat[i][x] = count;
                System.out.print(mat[i][x] + " ");
                count++;
            }
            System.out.println();
        }
    }
}
