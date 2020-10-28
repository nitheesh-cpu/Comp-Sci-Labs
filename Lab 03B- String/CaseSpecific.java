import java.util.Scanner;
public class CaseSpecific {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter line 1:");
        String firstLine = input.nextLine();
        System.out.println("Enter line 2:");
        String secondLine = input.nextLine();
        System.out.println("line 1:" + firstLine);
        System.out.println("line 2:" + secondLine);
        System.out.println("They are the same? " + firstLine.toLowerCase().equals(secondLine.toLowerCase()));
        String secondLineNoVowels = secondLine.replaceAll("[AEIOUaeiou]","");
        String firstLineNoVowels = firstLine.replaceAll("[AEIOUaeiou]", "");
        System.out.println("line 1:" + firstLineNoVowels);
        System.out.println("line 2:" + secondLineNoVowels);

    }

}
