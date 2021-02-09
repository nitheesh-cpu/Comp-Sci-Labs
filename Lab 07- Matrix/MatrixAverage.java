import java.util.Random;
import java.util.Scanner;

public class MatrixAverage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int RowSize = input.nextInt();
        int ColumnSize = input.nextInt();

        int[][] TwoDArr = new int[RowSize][ColumnSize];

        int Seed = input.nextInt();

        Random rand = new Random(Seed);

        double Total = RowSize*ColumnSize;
        double Val = 0;

        for(int m = RowSize; m>0; m--) {
            for (int i = ColumnSize; i > 0; i--) {
                double num = rand.nextDouble();
                num *= 100;
                Val += num;
                System.out.print(" ");
                System.out.printf("%4.1f", num);

        }
            System.out.println();
        }

        double Average = Val/Total;

        System.out.print("The average is: ");
        System.out.printf("%.1f", Average);
    }
}
