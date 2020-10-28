import java.util.Scanner;
public class DNA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter DNA Sequence:");
        String DNAsequence = input.nextLine();
        System.out.println("Enter DNA Sequence:");
        String FindInSequence = input.nextLine();
        System.out.println("The sequence of "+ DNAsequence + " has the " + FindInSequence + " appear at:");
        int pos = DNAsequence.indexOf(FindInSequence);
        pos = DNAsequence.indexOf(FindInSequence, pos + 1);
        System.out.println("Second appearance:" + DNAsequence.indexOf(FindInSequence , pos));
        pos = DNAsequence.indexOf(FindInSequence, pos + 1);
        System.out.println("Third appearance:" + DNAsequence.lastIndexOf(FindInSequence , pos));
        int lastPos = DNAsequence.lastIndexOf(FindInSequence);
        lastPos = DNAsequence.lastIndexOf(FindInSequence, lastPos - 1);
        System.out.println("Second to last appearance:" + lastPos);
    }
}
