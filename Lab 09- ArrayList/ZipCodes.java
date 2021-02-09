import java.io.File;
import java.io.IOException;
import java.util.*;
public class ZipCodes {
    public static void main(String args[])throws IOException {
        Scanner input = new Scanner(new File("ZipCodes.txt"));
        ArrayList<String> zipCodes = new ArrayList<>();
        int amountOfZips = input.nextInt();
        String zips = "";
        String discard = input.nextLine();
        while(amountOfZips > 0){
            zips = input.next();
            zipCodes.add(zips);
            amountOfZips--;
        }
        System.out.println("Initial List");
        printList(zipCodes);
        System.out.println();
        int secondZips = input.nextInt();
        while(secondZips>0){
            zips = input.next();
            System.out.println("Adding " + zips);
            addZip(zipCodes, zips);
            secondZips--;
        }
        System.out.println("Current List");
        printList(zipCodes);
        System.out.println();
        int thirdZips = input.nextInt();
        while(thirdZips>0){
            zips = input.next();
            System.out.println("Removing " + zips);
            removeZip(zipCodes, zips);
            thirdZips--;
        }
        System.out.println("Current List");
        printList(zipCodes);
    }

    public static void addZip(ArrayList<String> zipCodes, String zip) {
        if(!(zipCodes.contains(zip)))
            zipCodes.add(zip);
    }

    public static void removeZip(ArrayList<String> zipCodes, String zip) {
        for(int i = 0; i < zipCodes.size(); i++)
            if(zipCodes.get(i).equals(zip))
                zipCodes.remove(i);
    }

    public static void printList(ArrayList<String> zipCodes) {
        for (String zipCode : zipCodes)
            System.out.print(zipCode + " ");
    }
}
