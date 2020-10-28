import java.util.Scanner;
public class TripleAuthentication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter question 1:");
        String question1 = input.nextLine();

        System.out.println("Enter answer 1:");
        String answer1 = input.nextLine();
        answer1 = answer1.substring(1,answer1.length()-1);

        System.out.println("Enter question 2:");
        String question2 = input.nextLine();

        System.out.println("Enter answer 2:");
        String answer2 = input.nextLine();
        answer2 = answer2.substring(1,answer2.length()-1);

        System.out.println("Enter question 3:");
        String question3 = input.nextLine();

        System.out.println("Enter answer 3:");
        String answer3 = input.nextLine();
        answer3 = answer3.substring(1,answer3.length()-1);

        System.out.println(question1);
        String answeredFor1 = input.nextLine();
        System.out.println(answer1.equals(answeredFor1));
        
        System.out.println(question2);
        String answeredFor2 = input.nextLine();
        System.out.println(answer2.equals(answeredFor2));
        
        System.out.println(question3);
        String answeredFor3 = input.nextLine();
        System.out.println(answer3.equals(answeredFor3));

    }
}
