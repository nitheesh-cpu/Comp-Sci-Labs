import java.util.Scanner;

public class WordFind {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int repeat = input.nextInt();
        String[] array = new String[repeat];
        for(int i = 0; i < repeat; i++){
            array[i] = input.next().toUpperCase();
        }
        String words = input.nextLine();
        for(String y: array) System.out.print(y + " ");
        System.out.println();
        words = input.nextLine();
        String[] remove = words.split("\\s+");
        for(int i = 0; i < array.length; i++){
            for (int k = 0; k < remove.length; k++) {
                if (array[i].compareToIgnoreCase(remove[k]) == 0) {
                    array[i] = "";
                }
            }
        }
        for(String x: array){
            if(x.length()<1)
                System.out.print("");
            else
                System.out.print(x + " ");
        }
    }
}
